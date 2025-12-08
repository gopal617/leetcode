class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ma=0;
        while(left<right){
            ma=Math.max(ma,(Math.min(height[left],height[right])*(right-left)));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ma;
    }
}