class Solution {

    public long countSubArrayProductLessThanK(long arr[], int n, long k) {
        if (k <= 1) return 0; // Early exit

        long product = 1;
        int start = 0;
        long count = 0;

        for (int end = 0; end < n; end++) {
            product *= arr[end];

            while (product >= k && start <= end) {
                product /= arr[start];
                start++;
            }

            // Count subarrays ending at 'end' and starting from 'start'
            count += (end - start + 1);
        }

        return count;
    }
}
