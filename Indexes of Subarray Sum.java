 int start = 0, sum = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];  // Expand window

            while (sum > target && start <= end) {
                sum -= arr[start];  // Shrink window
                start++;
            }

            if (sum == target) {
                result.add(start + 1);  // 1-based index
                result.add(end + 1);
                return result;
            }
        }
        
        result.add(-1); // No subarray found
        return result;
