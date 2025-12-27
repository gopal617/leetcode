class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        while(i>=0 || j>=0){
            int skips=0;
            while(i>=0){
                if(s.charAt(i)=='#'){
                    skips++;
                    i--;
                }
                else if (skips>0){
                    skips--;
                    i--;
                }
                else{
                    break;
                }
            }
             int skipt=0;
            while(j>=0){
                if(t.charAt(j)=='#'){
                    skipt++;
                    j--;
                }
                else if (skipt>0){
                    skipt--;
                    j--;
                }
                else{
                    break;
                }
            }
            char c =i>=0 ? s.charAt(i):'.';
            char d=j>=0 ? t.charAt(j):'.';
            if(c!=d){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}