class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
       String [] p= path.split("/");
       for(String st:p){
        if(st.equals("") || st.equals(".")){
            continue;
        }
        else if(st.equals("..")){
            if(!(s.empty())){
                s.pop();
            }
        }
        else{
            s.push(st);
        }
       }
       StringBuilder sb = new StringBuilder();
       for(String str : s){
        sb.append("/").append(str);
       }
       return s.size() ==0 ? "/" : sb.toString();
    }
}
