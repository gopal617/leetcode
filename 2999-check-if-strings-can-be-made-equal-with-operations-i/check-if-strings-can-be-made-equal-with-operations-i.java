class Solution {
    public boolean canBeEqual(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1);
        int j=0;
        for(int i=0;i<s1.length()-2;i+=1){
            if(sb.charAt(i)!=s2.charAt(i)){
                char temp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(i+2));
                sb.setCharAt(i+2,temp);
            }
        }
        if(sb.toString().equals(s2)) return true;
        return false;
    }
}