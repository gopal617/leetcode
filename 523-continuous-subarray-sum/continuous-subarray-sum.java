class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length<2){
            return false;
        }
        int psum=0;
        Map<Integer,Integer> h = new HashMap<>();
        h.put(0,-1);
        for(int right=0;right<nums.length;right++){
            psum+=nums[right];
            if(h.containsKey(psum%k)){
                if((right-h.get(psum%k))>=2){
                    return true;
                }
            }
            else{
                h.put(psum%k,right);
            }
        }
        return false;
    }
}