class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int n=nums.length;
        int result[]=new int[n];
        int evenind=0,oddind=1;
        for(int x:nums){
            if((x & 1)==0){
                result[evenind]=x;
                evenind+=2;}
                else{
                result[oddind]=x;
                oddind+=2;}
                
            }
        
        return result;
    }


    }
