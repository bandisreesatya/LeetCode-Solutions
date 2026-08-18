class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int max=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max=Math.max(max,nums[i]);
        }
        if(k==n){
            return max;
        }
        max=-1;
        if(k==1){
            for(int key:map.keySet()){
                if(map.get(key)==1){
                    max=Math.max(max,key);
                }
            }
            return max;
        }
        max=-1;
        max=Math.max(nums[0],nums[n-1]);
        if(map.get(nums[0])==1 && map.get(nums[n-1])==1){
            return Math.max(nums[0],nums[n-1]);
        } 
        if(map.get(nums[0])!=1 && map.get(nums[n-1])!=1){
            return -1;
        }
        if(map.get(nums[0])==1){
            return nums[0];
        }
        return nums[n-1];
    }
}