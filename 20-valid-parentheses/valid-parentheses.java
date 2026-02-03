class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<s.length()){
            if(st.empty()){
                st.push(s.charAt(i));
            }
            else{
                if((s.charAt(i)=='}' && st.peek()=='{') || ((s.charAt(i)==')') && st.peek()=='(') || (s.charAt(i)==']' && st.peek()=='[')){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            i++;
        }
        if(st.empty()){
            return true;
        }
        return false;
    }
}