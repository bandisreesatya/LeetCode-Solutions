class NumArray {
    SegmentTree st;
    public NumArray(int[] nums) {
        st=new SegmentTree(nums);
    }
    
    public void update(int index, int val) {
        st.update(index,val);
    }
    
    public int sumRange(int left, int right) {
        return st.rangeSum(0,0,st.n-1,left,right);
    }
}

class SegmentTree{
    int[] a;
    int[] st;
    int n;
    public SegmentTree(int[] arr){
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
   void update(int idx,int val){
    int ss=0,se=n-1;
    int node=0;
    while(ss!=se){
        int mid=(ss+se)/2;
        if(idx<=mid){
            node=2*node+1;
            se=mid;
        }
        else{
            node=2*node+2;
            ss=mid+1;
        }
    }
    st[node]=val;
    while(node>0){
        int parent=(node-1)/2;
        st[parent]=st[2*parent+1]+st[2*parent+2];
        node=parent;
    }
    a[idx]=val;
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
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */