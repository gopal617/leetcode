class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        Stack<Integer> s = new Stack<>();
        int[] arr= new int[nums.length];
        Arrays.fill(arr,-1);
        for(int i=0;i<2*n;i++){
            int in=i%n;
            while(!(s.empty()) && nums[s.peek()]<nums[in]){
                arr[s.pop()]=nums[in];
            }
            if(i<n){
                s.push(i);
            }
        }
        
        return arr;
    }
}