class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    private void dfs(int[][] image, int i,int j, int color,int st){
        if(i<0 || j<0 || i>=image.length || j>=image[i].length || image[i][j]==color || image[i][j]!=st) return;
        image[i][j]=color;
        dfs(image,i-1,j,color,st);
        dfs(image,i+1,j,color,st);
        dfs(image,i,j-1,color,st);
        dfs(image,i,j+1,color,st);
        
    }
}