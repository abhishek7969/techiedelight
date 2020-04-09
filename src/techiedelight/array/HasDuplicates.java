package techiedelight.array;

import java.util.HashMap;
import java.util.Map;

public class HasDuplicates {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 8, 2, 4, 6, 9 };
		System.out.println(getDuplicates(arr, 2));
	}

	private static boolean getDuplicates(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int range = i - map.get(arr[i]);
				if (range <= k)
					return true;
			}
			map.put(arr[i], i);
		}
		return false;

	}

}
