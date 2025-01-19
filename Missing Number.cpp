class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int xor1 = 0, xor2 = 0;
        int n = nums.size(); // Total number of elements (including the missing one)

        // XOR of array elements
        for (int i = 0; i < n; i++) {
            xor2 ^= nums[i];
        }

        // XOR of numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor1 ^= i;
        }

        // The missing number is the XOR of the above two results
        return xor1 ^ xor2;
    }
};
