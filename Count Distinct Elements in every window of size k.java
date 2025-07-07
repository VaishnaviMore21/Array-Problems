
import java.util.*;

class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Process first window of size k
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result.add(map.size());

        // Process the remaining windows
        for (int i = k; i < arr.length; i++) {
            // Remove the outgoing element (leftmost of previous window)
            if (map.get(arr[i - k]) == 1) {
                map.remove(arr[i - k]);
            } else {
                map.put(arr[i - k], map.get(arr[i - k]) - 1);
            }

            // Add the incoming element (rightmost of current window)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            result.add(map.size());
        }

        return result;
    }
}
