class Solution {
    public int findDuplicate(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])]<0){
                return Math.abs(nums[i]);
            }
            nums[Math.abs(nums[i])]=(-1)*nums[Math.abs(nums[i])];
        }  
        return c;      
    }
}