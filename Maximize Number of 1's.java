class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int left=0,zeros=0,longest=0;
        for(int right=0;right<arr.length;right++)
        {
            if(arr[right]==0)zeros++;
            while(zeros>k)
            {
                if(arr[left]==0)zeros--;
                left++;
            }
            longest=Math.max(longest,right-left+1);
            
        }
        return longest;
    }
}
