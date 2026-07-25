class Solution {
    public int maxProduct(int n) {
        int rem=0;
        int max1=0,max2=0;
        while(n!=0){
            rem=n%10;
            if(rem>max1){
                max2=max1;
                max1=rem;
            }
            else if(rem>max2){
                max2=rem;
            }
            n/=10;
        }
        return max1*max2;
    }
}