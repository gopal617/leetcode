class Solution {
    public String removeKdigits(String num, int k) {
        if (k==num.length()) return "0";
        Stack <Integer> stack = new Stack<>();
        for(char c : num.toCharArray()){
            int n=c-'0';
            while((!stack.empty()) && stack.peek()>n && k>0){
                stack.pop();
                k--;
            }
            stack.push(n);
        }
        while(k>0 && (!stack.empty())){
            stack.pop();
            k--;
        }
        while((!stack.empty()) && stack.get(0)==0){
            stack.remove(0);
        }
        if (stack.empty()) return "0";
        String res = stack.stream().map(Object :: toString).collect(Collectors.joining(""));
        return res;
    }
}