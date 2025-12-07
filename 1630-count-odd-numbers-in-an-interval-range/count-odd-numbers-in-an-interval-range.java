class Solution {
    public int countOdds(int low, int high) {
        if(low%2==1 ){
            return (high-low+1)-(high/2-low/2) ;
        }
        return (high-low+1)-(high/2-low/2+1) ;
        
    }
}