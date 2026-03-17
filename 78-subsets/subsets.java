class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),l);
        return l;
    }
    private void backtrack(int[] nums,int start,List<Integer> tem,List<List<Integer>> res){
        res.add(new ArrayList<>(tem));
        for(int i=start;i<nums.length;i++){
            tem.add(nums[i]);
            backtrack(nums,i+1,tem,res);
            tem.remove(tem.size()-1);
        }

    }
}