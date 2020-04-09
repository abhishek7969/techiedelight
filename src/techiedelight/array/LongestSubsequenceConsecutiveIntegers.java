package techiedelight.array;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestSubsequenceConsecutiveIntegers {

	public static void main(String[] args) {
		
		int [] arr = {2,0,6,1,5,3,7};
		System.out.println(findMaxLenSubSeq(arr));
	}

	private static int findMaxLenSubSeq(int[] arr) {
		
		//Convert a array to a set.
		Set<Integer> s = IntStream.of(arr).boxed().collect(Collectors.toSet());
		
		int maxLen = 1;
		for (Integer i : s) {
			
			if(! s.contains( i-1)) {
				int len = 1;
				while(s.contains(i+len)) {
					len++;
				}
				maxLen = Math.max(maxLen, len);				
			}			
		}
		return maxLen;		
	}

}
