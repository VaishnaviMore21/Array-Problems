
class Solution {
public:
    int singleNumber(vector<int>& arr) {
        int n=arr.size();
        map<int,int>mpp;
        for(int i=0;i<n;i++)
        {
         mpp[arr[i]]++;   
        }
        for (auto it : mpp) {
        if (it.second == 1)
            return it.first;
    }

    //This line will never execute
    //if the array contains a single element.
    return -1;
    }
};
