public class numIslands200 {
    void dfs(char[][] grid,int i,int j){
        if (i<0|| j<0|| i>grid.length-1 ||j>grid[0].length )
            return;
        if (grid[i][j]=='0')return;
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int numsOfIsland=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                if (grid[i][j]=='1'){
                    dfs(grid,i,j);
                   numsOfIsland++;
                }
            }
        }
        return numsOfIsland;
    }
}
//class Solution {
//    void dfs(char[] grid, int row ,  int col,boolean[][] visited){
//
//
//    }
//    public int numIslands(char[][] grid) {
//        int m = grid.length;
//        int n= grid[0].length;
//        boolean [][]visted = new boolean[m][n];
//        int numsOfIsland=0;
//        for(int i=0; i<m; i++){
//            for(int j=0; j<m; j++){
//                if(!visited[i][j] && grid[i][j] == '1'){
//                    dfs(grid,i,j,visited);
//                    numsOfIsland++;
//                }
//            }
//        }
//
//        return numsOfIsland;
//    }
//}