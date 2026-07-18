class Edge{
    int u,v,w;
    public Edge(int u,int v,int w){
        this.u=u;
        this.v=v;
        this.w=w;
    }

}
class ufds{
    int n;
    int[] parent;
    public ufds(int n){
        this.n=n;
        parent=new int[n];
        for(int i=0;i<n;i++){
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
        int leadx=find(x);
        int leady=find(y);
        if(leadx==leady){
            return false;
        }
        parent[leady]=leadx;
        return true;
    }
}
class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        List<Edge> allEdges=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int x1=points[i][0];
                int y1=points[i][1];
                int x2=points[j][0];
                int y2=points[j][1];
                allEdges.add(new Edge(i,j,Math.abs(x1-x2)+Math.abs(y1-y2)));
            }
        }
        Collections.sort(allEdges,(a, b) -> Integer.compare(a.w, b.w));
        int res=0;
        int min_cost=0;
        ufds ds=new ufds(n);
        for(Edge e:allEdges){
            if(ds.merge(e.u,e.v)){
                min_cost+=e.w;
               res++;
              if(res==n-1){
                break;
            }
            }
        }
        return min_cost;
    }
}