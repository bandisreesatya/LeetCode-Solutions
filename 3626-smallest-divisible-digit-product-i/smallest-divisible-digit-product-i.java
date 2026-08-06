class Solution {
    public int smallestNumber(int n, int t) {
        while(n<=100){
            if(n<10){
                if(n%t==0){
                    return n;
            }
            }
            else{
            int temp=n;
            int d1=temp%10;
            temp/=10;
            int d2=temp%10;
            int res=d1*d2;
            if(res%t==0){
                return n;
            }
            }
            n++;
    }
        return 0;
    }
}