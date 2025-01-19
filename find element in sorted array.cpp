
class Solution {
  public:
    // Function to find element in sorted array
    // arr: input array
    // k: element to be searched
    bool searchInSorted(vector<int>& arr, int num) {

        // Your code here
        int n=arr.size();
        int i;
    for(i=0;i<n;i++)
    {
        if(arr[i]==num)
        return i;
    }
    return -1;
    }
};
