class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        java.util.Arrays.fill(res, -1);

        int w = 2 * k + 1;
        if (w > n) return res;

        long sum = 0;
        for (int i = 0; i < w; i++) sum += nums[i];
        res[k] = (int) (sum / w);

        for (int i = w; i < n; i++) {
            sum += nums[i] - nums[i - w];
            res[i - k] = (int) (sum / w);
        }
        return res;
    }
}