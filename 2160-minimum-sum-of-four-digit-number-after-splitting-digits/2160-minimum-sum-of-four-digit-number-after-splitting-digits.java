class Solution {
    public int minimumSum(int num) {
        int[] a = new int[4];

       for(int i=0;i<4;i++){
        a[i]=num%10;
        num=num/10;
       }
       //sort the separated array
       for(int i=0;i<4;i++){
        for(int j=i+1;j<4;j++){
            if(a[i]>a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
       }
        int num1=a[0]*10+a[2];
        int num2=a[1]*10+a[3];
       
       return num1+num2;
        

        
    }
}
