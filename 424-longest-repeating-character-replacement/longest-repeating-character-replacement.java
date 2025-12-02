class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr= new int[26];
        int left=0;
        int max_window_length=0;
        int max_freq=0;
        for(int right=0;right<s.length();right++){
            arr[s.charAt(right)-'A']++;
            max_freq=Math.max(max_freq,arr[s.charAt(right)-'A']);
           int window_length=right-left+1;
            if(window_length-max_freq>k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
           window_length=right-left+1;
           max_window_length=Math.max(window_length,max_window_length);
        }
        return max_window_length;       
    }
}