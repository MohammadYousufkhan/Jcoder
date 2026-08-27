class Solution {
    public int subtractProductAndSum(int n) {
        int count=0,sum=0,result=0,product=1;
        for(int i=0;n>0;i++){
           result=n%10;
           product*=result;
           sum+=result;
           n/=10;
        }
        return product-sum;
    }
    
}