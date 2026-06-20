class Solution {
    public int maxDistance(int[] p, int m) {
        int n=p.length;
        Arrays.sort(p);
        int l=1,r=p[n-1]-p[0];
            int idx=-1;
        while(l<=r){
            int mid=(l+r)/2;
            int b=m-1;
            int curr=p[0];
            for(int i=1;i<n;i++){
                int num=p[i]-curr;
                if(num>=mid){
                    b--;
                    curr=p[i];
                }
            }
            if(b<=0){
                idx=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return idx;
    }
   // return mid;
}