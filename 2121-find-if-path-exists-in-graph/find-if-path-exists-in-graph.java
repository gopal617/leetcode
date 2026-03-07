class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int[] e: edges){
            l.get(e[1]).add(e[0]);
            l.get(e[0]).add(e[1]);
        }
        boolean[] v = new boolean[n];
        return dfs(l,source,destination,v);
    }
    private boolean dfs(List<List<Integer>> l ,int s , int d ,boolean[] v){
        if(s==d) return true;
        v[s]= true;
        for(int neigh : l.get(s)){
            if(!v[neigh]){
                if(dfs(l,neigh,d,v)){
                    return true;
                }
            }
        }
        return false;
    }
}