class Solution {
    public String mergeAlternately(String word1, String word2) {
        int mi=Math.min(word1.length(),word2.length());
        StringBuilder s = new StringBuilder();
        for(int i=0;i<mi;i++){
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
        }
        if(word1.length()>word2.length()){
            s.append(word1.substring(mi));
        }
        else if(word2.length()>word1.length()){
            s.append(word2.substring(mi));
        }
        return s.toString();
    }
}