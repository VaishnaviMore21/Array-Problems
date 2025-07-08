// User function Template for Java

class Solution {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
         int oddIndexSum = 0;
        int evenIndexSum = 0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                // 0-based: 0, 2, 4 = 1st, 3rd, 5th = odd places
                oddIndexSum += Arr[i];
            } else {
                // 1, 3, 5 = even places
                evenIndexSum += Arr[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(oddIndexSum);
        result.add(evenIndexSum);

        return result;
        
    }
}
