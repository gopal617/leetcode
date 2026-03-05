class Solution {
    public int minOperations(String s) {
        int count=0;
        int count1=0;
        for(int i=0;i<s.length();i+=1){
            char pata=(i%2==0)? '0' : '1';
            char patb=(i%2==0)? '1': '0';
            if(s.charAt(i) != pata)count++;
            if(s.charAt(i) != patb)count1++;
        }
        return Math.min(count,count1);
    }
}