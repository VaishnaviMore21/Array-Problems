class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        int n = nums.size();

        // Step 1: Sort the array
        sort(nums.begin(), nums.end());

        for (int i = 0; i < n; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++; // Move the left pointer to increase the sum
                } else if (sum > 0) {
                    k--; // Move the right pointer to decrease the sum
                } else {
                    // Found a valid triplet
                    ans.push_back({nums[i], nums[j], nums[k]});

                    // Skip duplicates for the second and third elements
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    // Move pointers after handling duplicates
                    j++;
                    k--;
                }
            }
        }

        return ans;
    }
};
