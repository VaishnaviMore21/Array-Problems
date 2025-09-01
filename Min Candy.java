class Solution {
    static int minCandy(int arr[]) {
        // code here
        int n=arr.length;
        if(n==0)return 0;
        int candies[]=new int[n];
         for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }
         for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to Left check
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4: Sum candies
        int total = 0;
        for (int c : candies) total += c;

        return total;
    
        
    }
}
