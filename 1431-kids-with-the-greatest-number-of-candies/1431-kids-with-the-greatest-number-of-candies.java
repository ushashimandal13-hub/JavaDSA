class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxC = 0 ;
        for( int i : candies){
            maxC = Math.max(maxC, i);
        }
        List<Boolean> result = new ArrayList<>();
        for (int i: candies){
            if (i +  extraCandies >= maxC){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
        } 
        }  