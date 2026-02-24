class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[26];
        String b = "balon";
        for(char c: text.toCharArray()){
            arr[c-'a']++;
        }
       
        return  Math.min(
            Math.min(arr['b' - 'a'], arr['a' - 'a']),
            Math.min(
                arr['n' - 'a'],
                Math.min(arr['l' - 'a'] / 2, arr['o' - 'a'] / 2)
            ));
    }
}