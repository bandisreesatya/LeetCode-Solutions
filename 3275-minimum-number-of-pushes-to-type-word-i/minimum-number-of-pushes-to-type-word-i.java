class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        if(n<=8){
            return n;
        }
        int q=n/8;
        int r=n%8;  
        return (q*(q+1)/2)*8 +(q+1)*r;
    }
}