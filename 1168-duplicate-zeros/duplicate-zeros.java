class Solution {
    public void duplicateZeros(int[] nums) {
        int le1=nums.length-1;
        int n= le1+1;
        int zeroes=0;
        for(int e:nums){
            if (e==0){
                zeroes++;
            }
        }
        int le2=n+zeroes-1;
        while(le1>=0){
            if(le2<n){
                nums[le2]=nums[le1];
            }
            if(nums[le1]==0){
                le2--;
                if(le2<n){
                    nums[le2]=0;
                }

            }
            le1--;
            le2--;
        }
        
    }
}