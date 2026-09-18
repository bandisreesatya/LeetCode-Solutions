class Solution {
    public int findTheCity(int n, int[][] edges, int d) {
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
            dist[i][i] = 0;
        }

        for (int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            dist[u][v] = wt;
            dist[v][u] = wt;
        }

        for (int m = 0; m < n; m++){
            for (int s = 0; s < n; s++){
                for (int e = 0; e < n; e++){
                    if (dist[s][m] != Integer.MAX_VALUE &&
                        dist[m][e] != Integer.MAX_VALUE &&
                        dist[s][m] + dist[m][e] < dist[s][e]){

                        dist[s][e] = dist[s][m] + dist[m][e];
                        
                    }
                }
            }
        }
        int count = 0;
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < n; i++){
            count = 0;
            for (int j = 0; j < n; j++){
                if (dist[i][j] <= d){
                    count++;
                }
            }
            if (count <= min){
                min=count;
                idx = i;
            }
        }
        return idx;
    } 
}  
