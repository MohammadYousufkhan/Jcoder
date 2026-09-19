class Solution {
    public int maxVowels(String s, int k) {
        int cnt = 0, best = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) cnt++;
            if (i >= k && isVowel(s.charAt(i - k))) cnt--;
            if (i >= k - 1) {
                best = Math.max(best, cnt);
                if (best == k) return k; // can't do better
            }
        }
        return best;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}