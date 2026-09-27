class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];
        int[] res = new int[n];
        for (int x : nums) {
            freq[x]++;
        }

        int idx = 0;
        while (idx < n){
            for (int i = 1; i < 101; i++){
                if (freq[i] > 0){
                    res[idx++] = i;
                    freq[i]--;
                }
            }
        }

        return res;

    }
}