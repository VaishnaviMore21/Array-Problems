class Solution {
    int missingNum(int arr[]) {
        // code here
         int n = arr.length + 1;  // Since one number is missing
        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

     return (int)(total - sum);
    }
}
