class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans = new int[n];
        int depth = 0;
        for (int i = 0; i < n; i++) {
            if (seq.charAt(i) == '(') {
                ans[i] = depth++ & 1;   // assign by parity, then go deeper
            } else {
                ans[i] = --depth & 1;   // go back up, same parity as its '('
            }
        }
        return ans;
    }
}