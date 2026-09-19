class Solution {
    static int[] res = new int[10001];
    static{
        for (int i = 0; i < 10001; i++){
            res[i] = i;
        }
        for (int i = 2; i * i < 10001; i++){
            
            if (res[i] == i){

                for (int j = i * i; j < 10001; j += i){
                    if(res[j] == j){
                        res[j] = i;
                    }
                }
            }
        }
    }
    public int distinctPrimeFactors(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int num : nums){

            while (num > 1){
                set.add(res[num]);
                num/=res[num];
            }
        }
        return set.size();
    }
}