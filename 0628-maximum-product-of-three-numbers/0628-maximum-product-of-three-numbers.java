class Solution {
    public int maximumProduct(int[] nums) {
        int first=Integer.MIN_VALUE;int min1=Integer.MAX_VALUE;
        int sec=Integer.MIN_VALUE;int min2=Integer.MAX_VALUE;
        int third=Integer.MIN_VALUE;
        for(int x:nums){
            if(x>first){
                third=sec;
                sec=first;
                first=x;}
                else if(x>sec){
                    third=sec;
                    sec=x;}
                    else if(x>third){
                        third=x;}
                    
                    if(x<min1){
                        min2=min1;
                        min1=x;}
                        else if(x<min2){
                            min2=x;
                        }


                    }    
        return Math.max(first*sec*third,min1*min2*first);
    

    }
}