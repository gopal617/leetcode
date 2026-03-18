class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> l = new HashSet<>();
        backtrack(nums,0,new ArrayList<>(),l);
        return new ArrayList<>(l);
    }
    private void backtrack(int[] nums,int start,List<Integer> tem,Set<List<Integer>> res){
        res.add(new ArrayList<>(tem));
        for(int i= start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            tem.add(nums[i]);
            backtrack(nums,i+1,tem,res);
            tem.remove(tem.size()-1);
        }
    }
}