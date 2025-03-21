class Solution {
  public:
    vector<int> kLargest(vector<int>& arr, int k) {
        // Your code here
        int n=arr.size();
         priority_queue<int> pq;
	    vector<int> v;
	    for(int i=0;i<n;i++)
	    {
	        pq.push(arr[i]);
	    }
	         int j=0;
	    while(j<k)
	    {
	        v.push_back(pq.top());
	        pq.pop();
	        j++;
	    }
	    
	    return v;
    }
};
