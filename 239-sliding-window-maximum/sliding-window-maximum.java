class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left=0;
        int[] arr= new int[nums.length-k+1];
        Deque<Integer> q = new LinkedList<>();
        for(int right=0;right<nums.length;right++){
            while(q.size()>0 && nums[right]>nums[q.peekLast()]){
                q.pollLast();
            }
            q.add(right);
            if(q.peekFirst()<right-k+1){
                q.pollFirst();
            }
            if(right>=k-1){
                arr[right+1-k]=nums[q.peekFirst()];
                left++;
            }
        }
        return arr;
    }
}