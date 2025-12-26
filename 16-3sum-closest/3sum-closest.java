class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int resultsum=0;
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum= nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return target;
                }
                if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
                int differ=Math.abs(sum-target);
                if(differ<diff){
                    diff=differ;
                    resultsum=sum;
                }
            }
        }
        return resultsum;
    }
}