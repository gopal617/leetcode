class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0 && nums[i+1]!=0){
                nums[j]=nums[i+1];
                nums[i+1]=0;
                j+=1;
            }
            else if(nums[i]!=0 && nums[i+1]==0 || nums[i]!=0 && nums[i+1]!=0) j+=1;
            
        }
        
    }
}