// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        HashMap<Integer,Integer>freqmap=new HashMap<>();
        for(int num:arr)
        {
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }
        
        for (int num : arr) {
            if (freqmap.get(num) >1) {
                return num;
            }
        }
        
        return 0;
    }
}
