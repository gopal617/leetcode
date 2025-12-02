class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=1;
        int max_count=0;
        if (nums.length==1 && nums[0]==1){
            return 1;
        }
        for(int right=0;right<nums.length-1;right++){
            if(nums[right]==1 && nums[right+1]==1){
                count+=1;
                max_count=Math.max(max_count,count);
            }
            else if(nums[right]==1|| nums[right+1]==1){
                count=1;
                max_count=Math.max(max_count,count);

            }
        }
        return max_count;
    }
}