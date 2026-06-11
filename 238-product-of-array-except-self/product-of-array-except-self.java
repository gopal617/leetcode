class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeros=0;
        int product=1;
        int n=nums.length;
        int index=0;
        int[] products = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zeros++;
                index=i;
            }
            else{
                product=product*nums[i];
            }
        }
        if(zeros>1) return products;
        if(zeros==1) {
            products[index]=product;
            return products;
        }
        for(int i=0; i< n; i++){
            products[i]=product/nums[i];
        }
        return products;

    }
}