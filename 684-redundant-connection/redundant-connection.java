class ufds{
        int n;
        int[] parent;
        public ufds(int n){
            this.n=n;
            parent =new int[n+1];
            for(int i=1;i<n+1;i++){
                parent[i]=i;
            }
        }
    public int find(int x){
        if(x==parent[x]){
            return x;
        }
        return parent[x]=find(parent[x]);
    }
    public boolean merge(int x,int y){
        int leadx=find(x),leady=find(y);
        if(leadx==leady){
            return false;
        }
        parent[leady]=leadx;
        return true;
    }
}
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        ufds obj=new ufds(edges.length);
        for(int i=0;i<edges.length;i++){
            boolean flag=obj.merge(edges[i][0],edges[i][1]);
            if(!flag){
                return new int[]{edges[i][0],edges[i][1]};
            }
    }
    return new int[]{};
}
}