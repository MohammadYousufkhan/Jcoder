class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int x:nums){
            int digit=0;
            int temp=x;
            while(temp>0){
                digit++;
                temp/=10;
            }
            if((digit&1)==0)
            count++;
        }
        return count;
    }
}