class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j : nums){
            if(i==0 || i == 1 || nums[i-2]!=j){
                nums[i]=j;
                i+=1;
            }
        }
        return i;
    }
}