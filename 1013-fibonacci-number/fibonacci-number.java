class Solution {
    static int[] arr=new int[31];
    static{
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<31;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
    }
    public int fib(int n) {
       return arr[n];
    }
}