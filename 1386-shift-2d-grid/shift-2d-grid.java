class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list=new ArrayList<>();
        int r=grid.length;
        int c=grid[0].length;
        k=k%(r*c);
        while(k!=0){
        int num=grid[r-1][c-1];
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=0;j--){
                if(j==0){
                    if(i!=0){
                  grid[i][0]=grid[i-1][c-1];
                }
                }
                else{
                 grid[i][j]=grid[i][j-1];
                }
            }
        }
        grid[0][0]=num;
        k--;
        }
        for(int i=0;i<r;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<c;j++){
                l.add(grid[i][j]);
            }
            list.add(l);
        }
        
        return list;
    }

}