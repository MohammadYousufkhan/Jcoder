
        class Solution {
    public long countCommas(long n) {
        long total = 0;
        long lower = 1;
        int d = 1;
        while (lower <= n) {
            long upper = lower * 10 - 1;
            long hi = Math.min(upper, n);
            long count = hi - lower + 1;
            long commas = (d - 1) / 3;
            total += count * commas;
            lower *= 10;
            d++;
        }
        return total;
    
    }
}