class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        while (j < n){
            if (nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        for (int p = i; p < n; p++){
            nums[p] = 0;
        }
    }
}