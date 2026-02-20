class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack <Integer> s = new Stack<>();
        int[] tem = new int[temp.length];
        for(int i=0;i<temp.length;i++){
            while(!s.empty() && temp[i]>temp[s.peek()]){
                int ind=s.pop();
                tem[ind]=i-ind;
            }
            s.push(i);
        }
        return tem;
    }
}