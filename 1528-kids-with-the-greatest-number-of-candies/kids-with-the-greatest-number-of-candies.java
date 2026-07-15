class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(candies[i],max);
        }
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}