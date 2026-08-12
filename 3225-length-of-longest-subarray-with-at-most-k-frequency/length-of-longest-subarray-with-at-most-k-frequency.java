class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0;
        int max=Integer.MIN_VALUE;
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(map.get(nums[j])<=k){
                max=Math.max(max,j-i+1);
            }
            else{
                int num=nums[j];
                while(i<n && num!=nums[i]){
                    map.put(nums[i],map.get(nums[i])-1);
                    i++;
                }
                map.put(nums[i],map.get(nums[i])-1);
                i++;
            }
                j++;

        }
        return max;
    }
}