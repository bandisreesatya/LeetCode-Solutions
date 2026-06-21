class Solution {
    static int[] arr=new int[100001];
    static{
        //int[] arr=new int[100001];
        for(int i=0;i<100001;i++){
            int c=0;
            int t=i;
            while(t!=0){
                c++;
                t=t-(t&-t);
            }
            arr[i]=c;
        }
    }
    public int[] countBits(int n) {
        int[] res=new int[n+1];
            for(int i=0;i<=n;i++){
                res[i]=arr[i];
            }
            return res;
        }
    }
