class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(res, new char[2 * n], 0, 0, 0, n);
        return res;
    }

    private void dfs(List<String> res, char[] buf, int pos, int open, int close, int n) {
        if (pos == 2 * n) {
            res.add(new String(buf));
            return;
        }
        if (open < n) {
            buf[pos] = '(';
            dfs(res, buf, pos + 1, open + 1, close, n);
        }
        if (close < open) {
            buf[pos] = ')';
            dfs(res, buf, pos + 1, open, close + 1, n);
        }
    }
}
