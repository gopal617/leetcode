class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int[] arr = new int[101];
        for(int i:nums){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
            arr[i]=1;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(arr[i]==0){
                res.add(i);
            }
        }
        return res;
        }
    }