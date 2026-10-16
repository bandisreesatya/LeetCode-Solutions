class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int j = 0;
        int i = 0;
        while(j < nums.length){

            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
                k++;
            }

            j++;
        } 

        return k;
    }
}