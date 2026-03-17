class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums){
            if(i!=0){
                s.add(i);
            }
        }
        return s.size();
    }
}