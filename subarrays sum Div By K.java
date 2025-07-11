class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        
         Map<Integer, Integer> modFreq = new HashMap<>();
        modFreq.put(0, 1); // Empty subarray is divisible by k

        long prefixSum = 0;
        int total = 0;

        for (int num : arr) {
            prefixSum += num;

            // Handle negative remainder correctly
            int rem = (int) ((prefixSum % k + k) % k);

            total += modFreq.getOrDefault(rem, 0);

            modFreq.put(rem, modFreq.getOrDefault(rem, 0) + 1);
        }

        return total;
    }
    }


