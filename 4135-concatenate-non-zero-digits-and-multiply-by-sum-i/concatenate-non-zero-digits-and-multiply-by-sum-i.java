class Solution {
    public long sumAndMultiply(int n) {
        int temp=n;
        int rev=0,rem=0;
        long sum=0;
        while(temp!=0){
            rem=temp%10;
            if(rem!=0){
                rev=rev*10+rem;
                sum+=rem;
            }
            temp/=10;
        }
        temp=rev;
        int num=0;
        while(temp!=0){
            rem=temp%10;
            num=num*10+rem;
            temp/=10;
        }
        return (long)num*sum;
    }
}