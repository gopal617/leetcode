class Solution {
    public String minWindow(String s, String t) {  
        if(t.length()>s.length()) return "";
        int[] arr= new int[128];
        int st=0;
        int left=0;
        int count=t.length();
        int mi=Integer.MAX_VALUE;
        for(char c:t.toCharArray()){
            arr[c]++;
        }
        for(int right=0;right<s.length();right++){
            if(arr[s.charAt(right)]>0){
                count--;
            }
            arr[s.charAt(right)]--;
            while(count==0){
                if(right-left+1<mi){
                    mi=right-left+1;
                    st=left;
                }
                arr[s.charAt(left)]++;
                if(arr[s.charAt(left)]>0){
                    count++;
                }
                left++;
            }
        }
        return mi==Integer.MAX_VALUE ? "" : s.substring(st,st+mi);
                
    }
}