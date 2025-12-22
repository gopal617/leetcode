class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr= new int[2];
        for(int i =0;i<nums.length;i++){
            if(!(map.containsKey(target-nums[i]))){
                map.put(nums[i],i);
            }
            else{
                arr[0]=map.get(target-nums[i]);
                arr[1]=i;
                return arr;
            }
        }
        return arr;
    }
}