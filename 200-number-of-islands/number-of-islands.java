class Solution {
    public static void islands(char[][] grid,int i,int j,int r,int c){
        if(i<0 || i>=r||j<0||j>=c||grid[i][j]=='2'||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='2';
        islands(grid,i-1,j,r,c);
        islands(grid,i,j-1,r,c);
        islands(grid,i+1,j,r,c);
        islands(grid,i,j+1,r,c);
    }
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count++;
                    islands(grid,i,j,r,c);
                }
            }
        }
        return count;
    }
}