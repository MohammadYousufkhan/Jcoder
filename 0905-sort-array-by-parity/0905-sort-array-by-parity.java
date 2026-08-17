class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left=0,right=nums.length-1;
        while(left<right){
            if((nums[left]&1)==0){
                left++;
            }else if((nums[right]&1)==1){
                right--;
            }else{
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;}}
                return nums;
            
        }}
