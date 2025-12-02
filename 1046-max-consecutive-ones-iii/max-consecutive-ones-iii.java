class Solution {
    public int longestOnes(int[] s, int k) {
        int zeros=0;
        int max_ones=0;
        int left=0;
        for(int right=0;right<s.length;right++){
            if (s[right]==0){
                zeros++;
            }
            if (zeros>k){
                while(zeros>k){
                    if(s[left]==0){
                        zeros--;
                    }
                    left++;
                }
            }
            max_ones=Math.max(max_ones,right-left+1);
        }
        return max_ones;
    }
}