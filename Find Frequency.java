class Solution {
    Map<Integer,Integer>buildmap(int []arr)
    {
          Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }
    
    
    int findFrequency(int arr[], int x) {
        // code here
        Map<Integer,Integer>map=buildmap(arr);
        return map.getOrDefault(x,0);
        
    }
}
