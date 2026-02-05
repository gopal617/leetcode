class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int jum=nums[i]%nums.length;
            arr[i]=nums[(i+jum+nums.length)%nums.length];
        }
        return arr;
    }
}