import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();

        // Insert all elements from first array
        for (int x : a) {
            set.add(x);
        }

        // Insert all elements from second array
        for (int x : b) {
            set.add(x);
        }

        // Convert HashSet into ArrayList
        ArrayList<Integer> result = new ArrayList<>(set);
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        ArrayList<Integer> union = findUnion(a, b);

        // Print result (order may vary)
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}
