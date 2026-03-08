class Solution {
    public int findCircleNum(int[][] isConnected) {
        int p=0;
        int n=isConnected.length;
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(isConnected,vis,i);
                p++;
            }

        }
        return p;
    }
    private void dfs(int[][] c,boolean[] v,int ci){
        v[ci]=true;
        for(int j=0;j<c.length;j++){
            if(c[ci][j]==1 && !v[j]){
                dfs(c,v,j);
            }
        }
    }
}