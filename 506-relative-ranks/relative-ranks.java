class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer,Integer> m = new HashMap<>();
        String[] arr = new String[score.length];
        for(int i=0;i<score.length;i++){
            p.offer(score[i]);
            m.put(score[i],i);
        }
        for(int i=0;i<score.length;i++){
            if(i==0) arr[m.get(p.poll())]="Gold Medal";
            else if(i==1) arr[m.get(p.poll())]="Silver Medal";
            else if(i==2) arr[m.get(p.poll())]="Bronze Medal";
            else{
                arr[m.get(p.poll())]= String.valueOf(i+1);
            }
        }
        return arr;

    }
}