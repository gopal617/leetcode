class Solution {
    public List<String> summaryRanges(int[] nums) {
            ArrayList<String> l = new ArrayList<>();
            if(nums.length==0) return l;
            String strt=Integer.toString(nums[0]);
            for(int i=0;i<nums.length-1;i++){
                String end =Integer.toString(nums[i]);
                if(nums[i]+1 != nums[i+1]){
                    if(strt.equals(end)){
                        l.add(strt);
                        strt=Integer.toString(nums[i+1]);
                    }
                    else{
                        l.add(strt+"->"+end);
                        strt=Integer.toString(nums[i+1]);
                    }
                }
            }
            if(strt.equals(Integer.toString(nums[nums.length-1]))){
                l.add(Integer.toString(nums[nums.length-1]));
            }
            else{
            l.add(strt+"->"+Integer.toString(nums[nums.length-1]));
            }
            return l;
    }
}