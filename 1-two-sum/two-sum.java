class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<n;i++){
            int num=target-nums[i];
            if(map.containsKey(num)){
                arr[0]=map.get(num);
                arr[1]=i;
                return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}