class Solution {
    public int minimumDifference(int[] nums, int k) {

        Arrays.sort(nums);
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i+k-1<nums.length;i++){
            mindiff=Math.min(mindiff,(nums[i+k-1]-nums[i]));
        }
        return mindiff;
    }
}