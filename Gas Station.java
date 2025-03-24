class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int n=gas.size();
        int start=0;
        int currgas=0;
        for(int i=0;i<n;i++)
        {
            currgas=currgas+gas[i]-cost[i];
            if(currgas<0)
            {
                start=i+1;
                currgas=0;
            }
        }
        
    // Checking if startIdx can be a valid 
    // starting point for the Circular tour
    currgas = 0;
    for(int i = 0; i < n; i++) {
        
        // Circular Index
        int idx = (i + start) % n;
          currgas = currgas + gas[idx] - cost[idx];
        if(currgas < 0)
            return -1;
    }
    
    return start;
    }
};
