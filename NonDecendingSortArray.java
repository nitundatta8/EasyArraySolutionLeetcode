/*
 Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
*/

package ArrayEasyLeetcode;

import java.util.Arrays;

public class NonDecendingSortArray {

// brute force	
	/*
	 * static int[] sortArray(int [] arr) { for(int i=0;i<arr.length;i++) { arr[i] =
	 * arr[i]*arr[i];
	 * 
	 * } Arrays.sort(arr); return arr; }
	 */
//two pointer solution
	static int[] sortArray(int[] A) {
     int [] result = new int[A.length];
     int start=0;
     int end = A.length-1;
     int k = A.length-1;
     while(start<end) {
    	 int sqrStart = A[start] * A[start] ;
         int sqrEnd = A[end] * A[end]; 
         if(sqrStart>sqrEnd) {
        	 result[k--]= sqrStart;
        	 start++;
         }else {
        	 result[k--]= sqrEnd;
        	 end--;
         }
     }
     return result;
     
	}

	public static void main(String[] args) {
		int[] arr = { -7, -3, 2, 3, 11 };
		int[] result = sortArray(arr);
		System.out.println(Arrays.toString(result));
	}

}
