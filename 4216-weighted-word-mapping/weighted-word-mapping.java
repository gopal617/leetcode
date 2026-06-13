class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s= new StringBuilder();
        for(String i : words){
            int sum=0;
            for(int j=0;j<i.length();j++){
                int ind=i.charAt(j)-'a';
                sum+=weights[ind];
            }
            int Index = 26-sum%26;
            System.out.println(Index);
            char c= (char) (Index-1+'a' );
            s.append(c);
        }
        return s.toString();
    }
}