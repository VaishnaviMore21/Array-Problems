// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
         ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for(int num:arr)
        {
            if (freqMap.containsKey(-num) && freqMap.get(-num) > 0) {
                // Add the pair to result
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(-num);
                pair.add(num);
                result.add(pair);

                // Decrease frequency of the complement
                freqMap.put(-num, freqMap.get(-num) - 1);
            } else {
                // Increase frequency of the current number
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
        }
        return result;
    }
}
