class Solution {
    public int minimumSum(int num) {
        int i=0;
        int digit[]=new int[4];
        while(num>0){
            digit[i]=num%10;
            num/=10;
            i++;
        }
        Arrays.sort(digit);
        int new1=digit[0]*10+digit[2];
        int new2=digit[1]*10+digit[3];
        return new1+new2;
        
    }
}