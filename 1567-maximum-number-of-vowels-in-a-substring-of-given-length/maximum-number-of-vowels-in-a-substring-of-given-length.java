class Solution {
    public int maxVowels(String s, int k) {
      int left=0;
      int count=0;
      int ma=0;
      for(int right=0;right<s.length();right++){
        if ((s.charAt(right)=='a'||s.charAt(right)=='e'||s.charAt(right)=='i'||s.charAt(right)=='o'|| s.charAt(right)=='u')){
            count+=1;
        }
        if (right-left+1>k){
            left+=1;
        }
        if(right-left+1==k){
            if (left==0){
                ma= Math.max(count,ma);
            }
            if(left>0 && (s.charAt(left-1)=='a'||s.charAt(left-1)=='e'||s.charAt(left-1)=='i'||s.charAt(left-1)=='o'|| s.charAt(left-1)=='u')){
                count-=1;
            }
            else{
                ma= Math.max(count,ma);
            }
            }
        }
        return ma;
    }
}