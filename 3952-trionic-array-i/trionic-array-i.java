class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length<=3) return false;
        boolean f=false;
        boolean t=false;
        boolean th=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                f=true;
                if (t==true){
                    th=true;
                }
            }
            else if (nums[i]>nums[i+1]){
                if(f==true && t==true && th==true){
                    return false;
                }
                if(f==true){
                    t=true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }

        }
        if(f==true && t==true && th==true) return true;
        return false;
    }
}