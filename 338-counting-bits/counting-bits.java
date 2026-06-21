class Solution {
    static int[] arr=new int[100001];
    static{
        //int[] arr=new int[100001];
        for(int i=0;i<100001;i++){
           arr[i]=arr[i>>1]+(i&1);
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
