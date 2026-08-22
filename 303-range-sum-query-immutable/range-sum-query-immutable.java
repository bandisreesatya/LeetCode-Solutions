class NumArray {
    int[] a;
    int[] st;
    int n;
    
    public NumArray(int[] arr) {
        this.n=arr.length;
        this.a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=arr[i];
        }
        st=new int[4*n];
        build_segmentTree(0,0,n-1);
    }
    void build_segmentTree(int idx,int ss,int se){
        if(ss==se){
            st[idx]=a[ss];
            return;
        }
        int mid=(ss+se)/2;
        build_segmentTree(2*idx+1,ss,mid);
        build_segmentTree(2*idx+2,mid+1,se);
        st[idx]=st[2*idx+1]+st[2*idx+2];
    }        
    int rangeSum(int idx,int ss,int se,int qs,int qe){
        if(se<qs || ss>qe){
            return 0;
        }
        if(ss==qs && se==qe){
            return st[idx];
        }
        if(ss>=qs && se<=qe){
            return st[idx];
        }
        int mid=(se+ss)/2;
        int left=rangeSum(2*idx+1,ss,mid,qs,qe);
        int right=rangeSum(2*idx+2,mid+1,se,qs,qe);
        return left+right;
        
    }
    
    public int sumRange(int left, int right) {
        return rangeSum(0,0,n-1,left,right);
    }
}




/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */