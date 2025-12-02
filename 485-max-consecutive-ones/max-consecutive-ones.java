class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max_count=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==1){
                count++;
            }
            else{
                max_count=Math.max(max_count,count);
                count=0;
            }
        }
        return Math.max(max_count,count);
    }

}