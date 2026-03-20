class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        boolean[] bool = new boolean[nums.length];
        backtrack(l,nums,new ArrayList<>(),bool);
        return l;
    }
    private void backtrack(List<List<Integer>> res ,int[] nums,ArrayList<Integer> tem,boolean[] b){
        if(tem.size()==nums.length && (!res.contains(tem))) {
            res.add(new ArrayList<>(tem));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(b[i]) continue;
            b[i]=true;
            tem.add(nums[i]);
            backtrack(res,nums,tem,b);
            b[i]=false;
            tem.remove(tem.size()-1);
        }
    }
}