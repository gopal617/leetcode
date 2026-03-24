class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        arr[0]=leftind(nums,target);
        arr[1]=rightind(nums,target);
        return arr;
    }
    private int leftind(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid= left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            if(nums[mid]<target) {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
    private int rightind(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid= left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
           else if(nums[mid]<target) {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
}