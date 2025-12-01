class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       int[] pc= new int[26];
       int[] sc = new int[26];
       for(char c: p.toCharArray()){
            pc[c-'a']++;
       }
       int left=0;
       List<Integer> l = new ArrayList<>();
       for(int right=0;right<s.length();right++){
            sc[s.charAt(right)-'a']++;
            if(right-left+1==p.length()){
                if(Arrays.equals(pc,sc)){
                    l.add(left);
                }
                sc[s.charAt(left)-'a']--;
                left++;
            }
       }
       return l;
    }
}