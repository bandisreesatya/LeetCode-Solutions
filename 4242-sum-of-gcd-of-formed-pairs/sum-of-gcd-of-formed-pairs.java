class Solution {
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int[] prefix=new int[n];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            prefix[i]=gcd(nums[i],max);
        }
        long sum=0;
        Arrays.sort(prefix);
        for(int i=0;i<n/2;i++){
            sum+=gcd(prefix[i],prefix[n-i-1]);
        }
        return sum;
    }
}