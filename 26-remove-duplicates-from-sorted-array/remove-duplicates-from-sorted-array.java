class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 1, k = 1;

        while (i < n){

            if (nums[i] != nums[k - 1]){
                nums[k] = nums[i];
                k++;
            }
            
            i++;
        }

        return k;
        
    }
}