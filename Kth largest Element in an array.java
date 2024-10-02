class Solution {
    public int findKthLargest(int[] arr, int k) {
      Arrays.sort(arr);
      int n=arr.length;
      int largest=arr[n-k];
      return largest;
    }
}
