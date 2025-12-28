class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length==2){
            if(nums[0]>nums[1]){
                return 2;
            }
        }
        int left=0;
        int right=nums.length-1;
        while(left+1<nums.length && nums[left]<=nums[left+1]){left++;};
        while(right-1>0 && nums[right]>=nums[right-1]){right--;};
        if (left==nums.length-1){
            return 0;
        }
        // if(left==0 && right == nums.length-1){return 0;};
        int ma=Integer.MIN_VALUE;
        int mi=Integer.MAX_VALUE;
        for(int i=left;i<=right;i++){
            ma=Math.max(ma,nums[i]);
            mi=Math.min(mi,nums[i]);
        }
        while(left-1>=0 && mi < nums[left-1]){
            left--;
        }
        while(right+1<nums.length && ma>nums[right+1]){
            right++;
        }
        return right-left+1;
    }
}