class Solution {
    public String removeDuplicates(String s, int k) {
        Stack <int[]> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if((!stack.empty()) && stack.peek()[0]==c){
                stack.peek()[1]++;
                if(stack.peek()[1]==k){
                    stack.pop();
                }
            }
            else{
                stack.push(new int[]{c,1});
            }
        }
        StringBuilder sb= new StringBuilder();
        for(int[] i: stack){
            while(i[1]>0){
                sb.append((char) i[0]);
                i[1]--;
            }
        }
        return sb.toString();
    }
}