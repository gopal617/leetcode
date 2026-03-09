class Solution {
    public ArrayList<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] t = new boolean[n];
        for(List<Integer> e : edges){
            t[e.get(1)]=true;
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<t.length;i++){
            if(t[i]==false){
                l.add(i);
            }
        }
        return l;
    }
}