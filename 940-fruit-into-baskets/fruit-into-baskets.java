class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int max_=0;
        Map<Integer,Integer> m = new HashMap<>();
        for(int right=0;right<fruits.length;right++){
            m.put(fruits[right],right);
            while(m.size()>2){
                int minimumind=Integer.MAX_VALUE;
                int removefruit=-1;
                for(Map.Entry<Integer, Integer> e : m.entrySet()){
                    if(minimumind>e.getValue()){
                        minimumind=e.getValue();
                        removefruit=e.getKey();
                    }
                }
                left=minimumind+1;
                m.remove(removefruit);
            }
            max_=Math.max(max_,right-left+1);
        }
        return max_;
    }
}