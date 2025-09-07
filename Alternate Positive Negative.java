// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
         ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        // Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }
        
        arr.clear(); // clear original array to fill in order
        
        int i = 0, j = 0;
        // Merge alternately
        while (i < pos.size() && j < neg.size()) {
            arr.add(pos.get(i++));
            arr.add(neg.get(j++));
        }
        
        // Append remaining positives, if any
        while (i < pos.size()) {
            arr.add(pos.get(i++));
        }
        // Append remaining negatives, if any
        while (j < neg.size()) {
            arr.add(neg.get(j++));
        }
        
    }
}
