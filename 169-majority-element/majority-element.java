class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i : nums){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
                if(m.get(i)>nums.length/2) return i;
            }
            else{
                m.put(i,1);
                if(m.get(i)>nums.length/2) return i;
            }
        }
        return -1;
    }
}