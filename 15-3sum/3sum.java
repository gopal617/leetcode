class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        Set<List<Integer>> l = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int k=arr.length-1;
            int j=i+1;
            while(j<arr.length && j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    List<Integer> sub = new ArrayList<>();
                    sub.add(arr[i]);
                    sub.add(arr[j]);
                    sub.add(arr[k]);
                    l.add(sub);
                }
                if(sum<0) j++;
                else k--;
            }
        }
        return new ArrayList<>(l);
    }
}