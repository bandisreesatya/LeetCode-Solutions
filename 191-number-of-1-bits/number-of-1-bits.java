class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n!=0){
            c++;
            n=n-(n&-n);
        }
        return c;
    }
}