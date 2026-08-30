class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> invalid = new HashSet<>();
        for(int i=0;i<n;i++){
            if(invalid.contains(nums[i])){
                continue;
            }
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i])-i)==1){
                    map.put(nums[i],i);
                }
                else{
                    invalid.add(nums[i]);
                    map.remove(nums[i]);
                }
            }
            else{
                map.put(nums[i],i);
            }
        }
        return map.size();
    }
}