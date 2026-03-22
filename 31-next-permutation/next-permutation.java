class Solution {
    public void nextPermutation(int[] nums) {
        int k=0;
        int m=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                 m=i;
                for(int j=i;j<nums.length;j++){
                    if(nums[j]>nums[i-1]){
                        k=j;
                    }
                }
                int temp1=nums[i-1];
                nums[i-1]=nums[k];
                nums[k]=temp1;
                break; 
            }
        }
        int l=nums.length-1;
        while(m<l){
            int temp1=nums[l];
            nums[l]=nums[m];
            nums[m]=temp1;
            m++;
            l--;
        }
    }
}