class Solution {
    int perimeter=0;
    public int islandPerimeter(int[][] grid) {
        int n= grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                }
            }
        }
        return perimeter;
    }
    private void dfs(int[][] grid,int i ,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]==0){
            perimeter++;
            return;
        }
        if(grid[i][j]==2) return;
        grid[i][j]=2;
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }

}