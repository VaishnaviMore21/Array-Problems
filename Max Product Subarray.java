class Solution {
    int maxProduct(int[] nums) {
        // code here
        int n=nums.length;
        int leftProduct=1;
        int rightProduct=1;
        int ans=nums[0];
        for(int i=0;i<n;i++)
        {
       leftProduct = leftProduct == 0 ? 1 : leftProduct;
rightProduct = rightProduct == 0 ? 1 : rightProduct;

            leftProduct*=nums[i];
             rightProduct*=nums[n-1-i];
             ans=Math.max(ans,Math.max(leftProduct,rightProduct));
             
            
        }
        return ans;
    }
}
