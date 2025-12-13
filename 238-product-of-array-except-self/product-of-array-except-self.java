class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int[] arr = new int[nums.length];
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0 && m.containsKey(nums[i])){
                return arr;
            }
            if (nums[i]==0 && !(m.containsKey(nums[i]))){
                m.put(nums[i],i);
            }
            else{
                product=product*nums[i];
            }
        }
        if(m.containsKey(0)){
            arr[m.get(0)]=product;
            return arr;
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=product/nums[i];
        }
        return arr;
    }
}