class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        int count=0;
        for (char c: s.toCharArray()){
            arr[c]++;
        }
        boolean t = false;
        for(int i:arr){
            count+=(i/2)*2;
            if(i%2==1){
                t=true;
            }
        }
        if(t==true){ count++; return count;} ;
        return count;
    }
}