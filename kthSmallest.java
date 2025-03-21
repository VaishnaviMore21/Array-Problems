class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
             PriorityQueue<Integer>pq= new PriorityQueue<>();
        int n = arr.length  ;

        for (int i = 0; i < n; i++) {
            pq.add(arr[i])  ;
        }

        int f = k - 1 ;

        while (f > 0) {
            pq.remove()  ;
            f-- ;
        }

return pq.peek();

    
    }
}
