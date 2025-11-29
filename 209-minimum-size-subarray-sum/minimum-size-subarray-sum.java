class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int current_sum=0;
        int min=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            current_sum+=nums[right];
            while(current_sum>=target){
                min=Math.min(min,right-left+1);
                current_sum=current_sum-nums[left];
                left++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return min;
        }
       
    }
}