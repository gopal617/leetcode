class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] balloon = new int[27];
        for(char c : text.toCharArray()){
            balloon[c-'a']++;
        }
        if (balloon['l'-'a']<2 || balloon['o'-'a']<2) return 0;
       int c=0;
       while(balloon['b'-'a']!=0 && balloon['a'-'a']!=0 && balloon['l'-'a']!=0 && balloon['o'-'a']!=0  && balloon['n'-'a']!=0){
        if(balloon['b'-'a']>=1 && balloon['a'-'a']>=1 && balloon['l'-'a']>=2 && balloon['o'-'a']>=2 && balloon['n'-'a']>=1){
            c+=1;
            balloon['b'-'a']-=1;
            balloon['a'-'a']-=1;
            balloon['l'-'a']-=2;
            balloon['o'-'a']-=2;
            balloon['n'-'a']-=1;
        }
        else{
            balloon['l'-'a']=0;
        }
       }
       return c;

    }
}