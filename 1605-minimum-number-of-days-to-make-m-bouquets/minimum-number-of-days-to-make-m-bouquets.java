class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k> bloomDay.length) return -1;
        int start= Integer.MAX_VALUE;
        int end=Integer.MIN_VALUE;
        for(int i: bloomDay){
            start=Math.min(start,i);
            end=Math.max(end,i);
        }
        int res=-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(isboquet(bloomDay,m,k,mid)){
                res=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }
    private boolean isboquet(int[] b,int m,int k,int day){
        int boq=0;
        int cnt=0;
        for(int i:b){
            if(i<=day){
                cnt++;
                if(cnt==k){
                boq++;
                cnt=0;
            }
            }
            else{
                cnt=0;
            }
        }
        return boq>=m;
    }
}