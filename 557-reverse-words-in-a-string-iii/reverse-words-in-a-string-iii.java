class Solution {
    public String reverseWords(String s) {
        String [] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            StringBuilder s1 = new StringBuilder(str[i]);
            str[i]=s1.reverse().toString();
        }
        return String.join(" ",str);

    }
}