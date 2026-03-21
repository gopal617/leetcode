class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> l = new ArrayList<>();
        backtrack(l,s,0,new StringBuilder());
        return l;
    }
    private void backtrack(List<String> l,String s,int ind ,StringBuilder sb){
        if(sb.length() == s.length()){
            l.add(sb.toString());
            return;
        }
        if(Character.isLetter(s.charAt(ind))){
            sb.append(Character.toLowerCase(s.charAt(ind)));
            backtrack(l,s,ind+1,sb);
            sb.deleteCharAt(sb.length()-1);
            sb.append(Character.toUpperCase(s.charAt(ind)));
            backtrack(l,s,ind+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        else{
            sb.append(s.charAt(ind));
            backtrack(l,s,ind+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}