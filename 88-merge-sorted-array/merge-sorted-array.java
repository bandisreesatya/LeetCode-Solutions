class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int[] res = new int[m + n];
        int k = 0;

        while (i < m && j < n){

            if (nums1[i] < nums2[j]){
                res[k] = nums1[i];
                i++;
            }
            else{
                res[k] = nums2[j];
                j++;
            }
            k++;
            
        }

        while(i < m){
            res[k] = nums1[i];
            k++;
            i++;
        }

        while(j < n){
            res[k] = nums2[j];
            k++;
            j++;
        }

        for (int p = 0; p < m + n; p++){
            nums1[p] = res[p];
        }
    }
}