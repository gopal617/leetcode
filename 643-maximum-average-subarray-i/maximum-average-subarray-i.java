class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        double avg=Double.NEGATIVE_INFINITY;
        double sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(j-i+1>k){
                sum-=nums[i];
                i++;
            }
            if(j-i+1==k){
                avg=Math.max(sum/k,avg);
            }
        }
        return avg;
        
    }
}