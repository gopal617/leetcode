class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,nums,new ArrayList<>());
        return res;
    }
    private void backtrack(List<List<Integer>> res,int[] nums,ArrayList<Integer> tem){
        if(tem.size()==nums.length){
            res.add(new ArrayList<>(tem));
            return;
        }
        for(int i:nums){
            if(tem.contains(i)) continue;
            tem.add(i);
            backtrack(res,nums,tem);
            tem.remove(tem.size()-1);
        }
    }
}