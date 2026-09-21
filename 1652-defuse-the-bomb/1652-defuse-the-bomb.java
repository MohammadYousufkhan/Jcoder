class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if (k == 0) return res;

        int l, r;
        if (k > 0) {
            l = 1;
            r = k;
        } else {
            l = n + k;
            r = n - 1;
        }

        int win = 0;
        for (int i = l; i <= r; i++) win += code[i % n];

        for (int i = 0; i < n; i++) {
            res[i] = win;
            win -= code[l % n];   // drop left
            l++;
            r++;
            win += code[r % n];   // add right
        }
        return res;
    }
}