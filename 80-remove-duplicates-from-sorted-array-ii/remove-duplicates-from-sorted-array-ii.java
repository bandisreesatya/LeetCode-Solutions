class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 2, k = 2;

        while(i < n){

            if (nums[i] != nums[k - 2]){
                nums[k] = nums[i];
                k++;
            }

            i++;
        }

        return k;
    }
}