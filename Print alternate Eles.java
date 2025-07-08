class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
          ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i += 2) {
            result.add(arr[i]);
        }

        return result;
    }
}
