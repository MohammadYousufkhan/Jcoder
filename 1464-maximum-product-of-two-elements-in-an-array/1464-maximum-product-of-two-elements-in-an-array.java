class Solution {
    public int maxProduct(int[] nums) {
        int first=0;
        int sec=0;
        for(int x:nums){
            if(x>first){
                sec=first;
                first=x;}
                else if(x>sec){
                    sec=x;
                }
    
            }
        return (first-1)*(sec-1);
    }
}