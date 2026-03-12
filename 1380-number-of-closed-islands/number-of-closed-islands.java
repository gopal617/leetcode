class Solution {
    int closed=0;
    boolean close;
    public int closedIsland(int[][] grid) {
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==0){
                    close=true;
                    dfs(grid,i,j);
                   if(close) closed++;
                }
            }
        }
        return closed;
    }
    private void dfs(int[][] grid, int i,int j){
       if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==1) return;
        else if(i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1) close = false;

        grid[i][j]=1;
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}