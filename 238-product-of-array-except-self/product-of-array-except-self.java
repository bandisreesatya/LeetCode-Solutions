class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefix=1;
        int suffix=1;
        int[] arr=new int[n];
        arr[0]=1;
        arr[n-1]=1;
        for(int i=1;i<n;i++){
            arr[i]=nums[i-1]*prefix;
            prefix=arr[i];
        }
        for(int i=n-2;i>=0;i--){
            suffix*=nums[i+1];
            arr[i]*=suffix;
        }
        return arr;
    }
}