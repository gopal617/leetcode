class Solution {
    public int[] findErrorNums(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int v=0;
        for(int i=0;i<nums.length;i++){
            int idx= Math.abs(nums[i])-1;
            if(nums[idx]<0){
                l.add(Math.abs(nums[i]));
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
        l.add(tsum-sum);
        
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}