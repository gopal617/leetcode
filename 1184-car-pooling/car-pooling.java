class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int max_end=0;
        for(int[] i : trips){
            max_end=Math.max(max_end,i[2]);
        }
        int[] arr = new int[max_end+1];
        for(int i=0;i<trips.length;i++){
            arr[trips[i][1]]+=trips[i][0];
            arr[trips[i][2]]-=trips[i][0];
        }
        int cap=0;
        for(int i=0;i<arr.length;i++){
            cap+=arr[i];
            if(cap>capacity){
                return false;
            }
        }
        return true;
    }
}