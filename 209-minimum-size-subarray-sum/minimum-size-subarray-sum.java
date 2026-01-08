class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int sum=0;
        int min_value=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                min_value=Math.min(min_value,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(min_value==Integer.MAX_VALUE){
            return 0;
        }
        return min_value;
       
    }
}