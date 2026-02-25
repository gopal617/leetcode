class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ranse = new int[26];
        int[] mag= new int[26];
        for(char c: ransomNote.toCharArray()){
            ranse[c-'a']++;
        }
        for(char c : magazine.toCharArray()){
            mag[c-'a']++;
        }
        for(int i=0 ;i<ranse.length;i++){
            if(ranse[i]>0 && mag[i]<ranse[i]){
                return false;
            }
        }
        return true;
    }
}