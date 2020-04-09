package techiedelight.array;

import java.util.Arrays;

/**
 * 
 * @author abhishek.kumar1
 * 
 * {1,-2,6,4,-3,2,-4,-3} --> {4,-3,2,-4}
 */

public class LongestAlternatingSubarray {

	public static void main(String[] args) {
		int[] arr = {1,-2,6,4,-3,2,-4,-3};
		findLongestAlternatingSubarray(arr);
	}
	
	public static void findLongestAlternatingSubarray(int [] arr) {		
		int count = 1;		
		int endIndex = 0;
		int maxLen=1;
		
		for(int i = 1 ; i< arr.length ; i++) {			
			if(arr[i] * arr[i-1] <0) {
				count++;
				
				if(count > maxLen) {
					maxLen = count;
					endIndex = i;
				}
			}
			else {
				count = 1;
			}			
		}
		
		int[] subarray = Arrays.copyOfRange(arr, (endIndex-maxLen+1), endIndex + 1);
		System.out.println(Arrays.toString(subarray));
		
	}
}
