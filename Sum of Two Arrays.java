
import java.util.*;

public class Solution {
	public static int[] findArraySum(int[] arr1, int n, int[] arr2, int m) {
		ArrayList<Integer> temp = new ArrayList<>();
		int i = n - 1, j = m - 1, carry = 0;

		while (i >= 0 || j >= 0 || carry > 0) {
			int sum = carry;
			if (i >= 0) sum += arr1[i--];
			if (j >= 0) sum += arr2[j--];

			temp.add(0, sum % 10);
			carry = sum / 10;
		}

		// Convert ArrayList to int[]
		int[] result = new int[temp.size()];
		for (int k = 0; k < temp.size(); k++) {
			result[k] = temp.get(k);
		}

		return result;
	}
}
