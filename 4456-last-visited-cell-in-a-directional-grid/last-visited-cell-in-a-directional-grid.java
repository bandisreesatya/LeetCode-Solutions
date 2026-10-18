class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int i = 0;
        int j = 0;
        int[] res = new int[2];
        Set<List<Integer>> set = new HashSet<>();

        while(i < r && j < c && i >= 0 && j >= 0){
            if (set.contains(Arrays.asList(i, j))){
                return res;
            }
            res[0] = i; res[1] = j;
            set.add(Arrays.asList(i, j));
            if (grid[i][j] == 'R'){
                j++;
            }
            else if (grid[i][j] == 'L'){
                j--;
            }
            else if (grid[i][j] == 'U'){
                i--;
            }
            else if (grid[i][j] == 'D'){
                i++;
            }  
        }

        return res;
    }
}