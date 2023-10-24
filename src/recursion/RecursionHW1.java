package recursion;

import java.util.Arrays;

public class RecursionHW1 {

	public static void main(String[] args) {

		int[] xArray = {9,7,2,1,4,5};
		System.out.println(sumArray(xArray));
		
		countDown(9);
		
		System.out.println(reverseString("Climbing"));
	}
	
	public static int sumArray(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		
		return arr[arr.length -1] + sumArray(Arrays.copyOfRange(arr, 0, arr.length-1));
	}
	
	public static void countDown(int x) {
		if (x < 1) {
			System.out.println(x);
			return;
		}
		
		System.out.println(x);
		countDown(x-1); 
	}
	
	public static String reverseString(String str) {
		if (str.length() == 1) {
			return str;
		}
		return str.substring(str.length() -1) + reverseString(str.substring(0, str.length()-1));
	}

}
