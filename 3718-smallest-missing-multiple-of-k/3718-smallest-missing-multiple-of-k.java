class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] present=new boolean[101];
        for(int num:nums){
            present[num]=true;
        }
        for(int x=k;x<=100+k;x+=k){
            if(x>100||!present[x]){
                return x;
            }
        }
        return -1;
    }
}