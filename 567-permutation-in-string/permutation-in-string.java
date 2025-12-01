class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int sum1=0;
        for(int i=0;i<s1.length();i++){
            sum1+=(int) s1.charAt(i);
        }
        int sum2=0;
        int left=0;
        StringBuilder s3= new StringBuilder();
        for(int right=0;right<s2.length();right++){
            sum2+=(int) s2.charAt(right);
            s3.append(s2.charAt(right));
            int c=s1.length();
            if(right-left+1 == s1.length()){
                if(sum1==sum2){
                    String s4= s3.toString();
                    for(int i=0;i<s1.length();i++){
                        if (s4.contains(""+s1.charAt(i))){
                            c--;
                        }
                        if (c==0){
                            return true;
                        }
                    }
                }
                sum2-=(int) s2.charAt(left);
                left++;
                s3.deleteCharAt(0);
            }
        }
        return false;
    }
}