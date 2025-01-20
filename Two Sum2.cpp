class Solution {
  public:
    bool twoSum(vector<int>& arr, int target) {
        // code here
        int n=arr.size();
        unordered_map<int,int>mpp;
        for(int i=0;i<n;i++)
        {
            int num=arr[i];
            int needed=target-num;
            if(mpp.find(needed)!=mpp.end())
            {
                return true;
            }
            mpp[num]=i;
        }
        return {};
    }
};
