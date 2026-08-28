class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>seen=new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }
        int i=1;
        while(true){
            int x=k*i;
            if(!seen.contains(x)){
                return x;
            }
            i++;
        }
    }
}