class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
        Arrays.sort(cost);
        int sum=0;
        for(int i=n-1;i>=0;i-=3){
            if(i-1>=0){
            sum+=cost[i]+cost[i-1];
            }
            else{
                sum+=cost[i];
            }
        }
        return sum;
    }
}