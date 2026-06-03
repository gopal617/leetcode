class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    c++;
                    dfs(grid,i,j);
                }
            }
        }
        return c;
    }
    private void dfs(char[] [] grid,int left,int right){
        if(left<0 || left>=grid.length || right>=grid[0].length || right<0 || grid[left][right]=='0') return;
        grid[left][right]='0';
        dfs(grid,left+1,right);
        dfs(grid,left-1,right);
        dfs(grid,left,right+1);
        dfs(grid,left,right-1);
    }
}