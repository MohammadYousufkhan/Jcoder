class Solution {
    public int romanToInt(String s) {
        int total = 0, prev = 0;
        // scan right to left: if current < previous, subtract; else add
        for (int i = s.length() - 1; i >= 0; i--) {
            int cur = val(s.charAt(i));
            total += cur < prev ? -cur : cur;
            prev = cur;
        }
        return total;
    }

    private int val(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            default:  return 1000; // 'M'
        }
    }
}