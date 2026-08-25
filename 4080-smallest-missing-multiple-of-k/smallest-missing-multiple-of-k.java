class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int i=1;
        for(i=1;i<=n;i++){
            int num=i*k;
            if(!set.contains(num)){
                return num;
            }
        }
        return i*k;
    }
}