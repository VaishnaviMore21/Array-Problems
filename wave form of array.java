class Solution {

    // Utility method to swap two elements in an array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sortInWave(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i += 2) {
            // If current even index is smaller than previous, swap
            if (i > 0 && arr[i] < arr[i - 1]) {
                swap(arr, i, i - 1);
            }

            // If current even index is smaller than next, swap
            if (i < n - 1 && arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
    }
}
