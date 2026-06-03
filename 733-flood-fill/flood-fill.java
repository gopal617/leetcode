class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    private void dfs(int[][] im,int left,int right,int co,int st){
        if(left<0|| right<0 || left>=im.length || right>=im[0].length || im[left][right]==co || im[left][right]!=st) return;
        im[left][right]=co;
        dfs(im,left+1,right,co,st);
        dfs(im,left-1,right,co,st);
        dfs(im,left,right+1,co,st);
        dfs(im,left,right-1,co,st);
    }
}