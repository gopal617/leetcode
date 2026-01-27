class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup=-1;
        int miss=-1;
        int v=0;
        for(int i=0;i<nums.length;i++){
            int idx= Math.abs(nums[i])-1;
            if(nums[idx]<0){
                dup=(Math.abs(nums[i]));
                v=i;
                break;
                
            }
            else{
                nums[idx]*=(-1);
            }
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if (i!=v){
                sum+=Math.abs(nums[i]);
            }
        }
        int n= nums.length;
        int tsum=n*(n+1)/2;
        miss=(tsum-sum);
        
        return new int[]{dup,miss};
    }
}