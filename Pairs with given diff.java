import java.util.Arrays;

class Solution {
    public boolean findPair(int[] arr, int x) {
        int n = arr.length;
        Arrays.sort(arr);  // Sort the array

        int i = 0, j = 1;

        while (i < n && j < n) {
            if (i != j) {
                int diff = Math.abs(arr[j] - arr[i]);
                if (diff == x) {
                    return true;
                } else if (diff < x) {
                    j++;
                } else {
                    i++;
                }
            } else {
                j++;
            }
        }

        return false;
    }
}
