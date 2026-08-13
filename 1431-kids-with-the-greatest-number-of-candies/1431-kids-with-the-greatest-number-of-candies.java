class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies=0;
        for(int i=0;i<candies.length;i++){
            maxcandies=Math.max(maxcandies,candies[i]);}
            List<Boolean> result=new ArrayList<>();
             for(int i=0;i<candies.length;i++){
            result.add(candies[i] + extraCandies>=maxcandies);}
                return result;
            }
             }
        
    
