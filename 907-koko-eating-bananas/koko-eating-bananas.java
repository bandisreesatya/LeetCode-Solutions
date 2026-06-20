class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(piles[i],max);
        }
       int l=1,r=max;
       int idx=-1;
        while(l<=r){
            int mid=(l+r)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=(Math.ceil((double)piles[i]/mid));
            }
            if(sum<=h){
                r=mid-1;
                idx=mid;
            }
            else{
                l=mid+1;
            }
            
        }
        return idx;
    }
    }