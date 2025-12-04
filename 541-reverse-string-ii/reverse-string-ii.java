class Solution {
    public String reverseStr(String s1, int k) {
        StringBuilder s= new StringBuilder(s1);
        int left=0;
        int n= s1.length();
        while(left<n){
            int right=Math.min(left+k-1,n-1);
            int i=left;
            while(i<right){
                char temp=s.charAt(i);
                s.setCharAt(i,s.charAt(right));
                s.setCharAt(right,temp);
                i++;
                right--;
            }
            left+=2*k;
        }
        return s.toString();   
    }
}