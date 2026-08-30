class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int minIndex=0,maxIndex=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
        }
        int l=Math.min(minIndex,maxIndex);
        int r=Math.max(minIndex,maxIndex);
        int f=r+1;
        int e=n-l;
        int b=l+1+n-r;

        return Math.min(f,Math.min(e,b));
        
        
    }
}