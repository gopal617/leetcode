class Solution {
    public boolean checkInclusion(String s, String p) {
        int[] pc= new int[26];
        int[] sc = new int[26];
        for(char c: s.toCharArray()){
                pc[c-'a']++;
        }
        int left=0;
        for(int right=0;right<p.length();right++){
            sc[p.charAt(right)-'a']++;
            if(right-left+1==s.length()){

                if(Arrays.equals(pc,sc)){
                    return true;
                }
                sc[p.charAt(left)-'a']--;
                left++;
            }
        }
        return false;
    }
}