class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left =0;
        long max=0;
        long sum=0;
        int[] arr = new int[100001];
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            arr[nums[right]]++;
            while(arr[nums[right]]>1){
                arr[nums[left]]--;
                sum-=nums[left];
                left++;
            }
            if(right-left==k-1){
                arr[nums[left]]--;
                max=Math.max(sum,max);
                sum-=nums[left];
                left++;
            }
        }
        return max;
    }
}