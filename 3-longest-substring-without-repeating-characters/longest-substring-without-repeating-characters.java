class Solution {
    public int lengthOfLongestSubstring(String st) {
        Set<Character> set = new HashSet<>();
        int left=0;
        int ma=0;
        for(int right=0;right<st.length();right++){
            while(set.contains(st.charAt(right))){
                set.remove(st.charAt(left));
                left++;
            }
            set.add(st.charAt(right));
            ma=Math.max(ma,right-left+1);

        }
        return ma;
    }
}