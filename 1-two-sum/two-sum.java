class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> m = new HashMap<>();
       int arr[] = new int[2];
       for(int i=0;i<nums.length;i++){
        if(!(m.containsKey(target-nums[i]))){
            m.put(nums[i],i);
        }
        else{
            arr[0]=m.get(target-nums[i]);
            arr[1]=i;
            return arr;
        }
       }
       return arr;
    }
}