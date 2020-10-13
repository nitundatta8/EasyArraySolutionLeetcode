package ArrayEasyLeetcode;

import java.util.Arrays;

/*
Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Solution1:FIRST APPROACH BRUTE FORCE
Rotate every single element of the given array to the right one at a time, total k times.

That means very last element of the array moves towards the very begging index and to continue this every single element will shift 1 unit to the right.

--- rotate 1 steps to the right: [7,1,2,3,4,5,6] 
--- rotate 2 steps to the right: [6,7,1,2,3,4,5]
--- rotate 3 steps to the right: [5,6,7,1,2,3,4]

space complexity -- O(1); no extra space.
Time complexity -- O(n * k)    n= array length, k= how many time the array will rotate.
[ This could potential results in TLE (Time Limit Exceeded exception)]

Use nested for loop to get the end result. The outer for loop will continue until k steps and inner for loop 
will perform to move each single element to the right at a time. That's mean, the last element 7[nums.lenght -1 index] 
will move towards the element 1[0 index],1 will move towards the element 2 [index 1], 2 will move towards the element 3 [index 2] and so on.

*/

/*
 * Solution2: USE AN EXTRA ARRAY
 Use an extra or additional array to assign all elements from the input array in a final correct position. 
 Then copy extra array into the input array.
 Find out correct position we can follow below formula
 k % array length
 Explanation:
 Input: [1,2,3,4,5,6,7] and k = 3              Output: [5,6,7,1,2,3,4]
 If we look carefully we can find a pattern, 
 For the element 1[i=0] the correct position in the output array is index 3 
 which is the same value as k + i.
 For the element 2[i=1] the correct position in the output array is index 4 
 which is the same as k + i and so on.
 ...
 ...
For the element 6[i=5] the correct position in the output array is index 8 which is out of the array length.It will create array out of bounds exception.
To over come this situation we are using modular(%) array length.
That means, always k value would be less than array length. 

Time: O(n), Space: O(n)
*/

/*
  Solution 3: we could reverse the input array three times:
    1. first reverse this entire array,
    2. secondly, reverse the array from 0 to k - 1
    3. lastly, reverse the array from k to length - 1
Time: O(n), Space: O(1)
 * */
public class RotatedArray {
//FIRST APPROACH BRUTE FORCE	
	public static class Solution1{
		static int[] rotated(int[]nums,int k){
			for(int i=0;i<k;i++) {
				for(int j=0;j<nums.length;j++) {
					int temp = nums[j];
					nums[j] = nums[nums.length-1];
					nums[nums.length-1]=temp;
				}
			}
			return nums;
		}
	}
//Use an extra array 
	static public class Solution2{
		 static int[] rotated(int[]nums,int k){
			int copyArr []  = new int[nums.length];
			for(int i=0;i<nums.length;i++) {
				k = (k+i) % nums.length;
				copyArr[k]=nums[i];
				k -=i;
			}
			System.out.println(Arrays.toString(copyArr));
			for(int i=0;i<nums.length;i++) {
				nums[i]=copyArr[i];
			}
			return nums;
		}
	
	}
//	
	static public class Solution3{
		 static int[] rotated(int[]nums,int k){
			
			 reverse(nums,0,nums.length-1);
			 reverse(nums,0,k-1);
			 reverse(nums,k,nums.length-1);
				return nums;
			} 
		 
		 static void reverse(int[]nums,int start,int end) {
			 while(start<end) {
				 int temp = nums[start];
				 nums[start]=nums[end];
				 nums[end]=temp;
				 start++;
				 end--;
			 }
		 }
	 }
	
	
	

	public static void main(String[] args) {
		
		int arr []= {1,2,3,4,5,6,7};
		int result [] =Solution3.rotated(arr, 3);
		System.out.print(Arrays.toString(result));
		
	}

}
