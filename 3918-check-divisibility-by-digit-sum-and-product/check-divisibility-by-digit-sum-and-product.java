class Solution {
    public boolean checkDivisibility(int n){
        if(n<10){

        }
        int rem=0,sum=0,pro=1;
        int temp=n;
        while(temp!=0){
            rem=temp%10;
            sum+=rem;
            pro*=rem;
            temp/=10;
        }

        sum+=pro;
        if(n%sum==0){
            return true;
        }
        return false;
    }
}