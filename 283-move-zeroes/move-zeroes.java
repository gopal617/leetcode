class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0 && nums[i+1]!=0){
                nums[c]=nums[i+1];
                nums[i+1]=0;
                c++;
            }
            else if((nums[i]!=0 && nums[i+1]==0)||nums[i]!=0 && nums[i+1]!=0) c++;
        }
    }
}