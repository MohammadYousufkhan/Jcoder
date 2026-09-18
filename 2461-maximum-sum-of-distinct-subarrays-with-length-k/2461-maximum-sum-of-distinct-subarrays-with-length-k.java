class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int[] cnt = new int[100001]; 
        int distinct = 0;
        long sum = 0, best = 0;

        for (int i = 0; i < nums.length; i++) {
        
            if (cnt[nums[i]]++ == 0) distinct++;
            sum += nums[i];

            if (i >= k) {
                int y = nums[i - k];
                if (--cnt[y] == 0) distinct--;
                sum -= y;
            }

            if (i >= k - 1 && distinct == k) {
                best = Math.max(best, sum);
            }
        }
        return best;
    }
}