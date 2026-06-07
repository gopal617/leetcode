class Solution {
    public int maxArea(int[] height) {
        int max =Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int water = Math.min(height[left],height[right])*(right-left);
            max=Math.max(water,max);
            if(height[left]<height[right]) left++;
            else right--;

        }
        return max;
    }
}