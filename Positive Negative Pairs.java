// User function Template for Java

class Solution {
    // Function to return list containing all the pairs having both
    // negative and positive values of a number in the array.
    public static ArrayList<Integer> findPairs(int arr[], int n) {
        // code here
          // Write your code here.
        Set<Integer>set=new HashSet<>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(set.contains(-arr[i]))
            {
                res.add(-Math.abs(arr[i]));
                res.add(Math.abs(arr[i]));
            }
            else
            {
                set.add(arr[i]);
            }
        }
        return res;
    }
}
