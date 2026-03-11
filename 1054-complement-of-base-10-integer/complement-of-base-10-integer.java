class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i)=='1'?'0' :'1');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}