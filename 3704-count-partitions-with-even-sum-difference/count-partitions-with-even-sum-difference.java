class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i :nums){
            sum+=i;
        }
        int count=0;
        for(int i: nums){
            if(((sum-i)-i)%2==0 ){
                count+=1;
            }
        }
        return Math.max(0,count-1);
        
    }
}