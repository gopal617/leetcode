class Solution {
    public boolean checkOnesSegment(String s) {
        if (s.equals("1")) return true;
        int seg =0;
        int lead=0;

        int[] one = new int[1];
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1') one[0]++;
            if(s.charAt(i)== '1' && s.charAt(i+1)=='1') seg++;
            if(s.charAt(i)=='0'&& s.charAt(i+1)=='1') lead++;
        }
        return one[0]==1 && lead==0 || seg>0 && lead==0;

    }
}