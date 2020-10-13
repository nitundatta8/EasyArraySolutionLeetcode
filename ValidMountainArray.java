package ArrayEasyLeetcode;

public class ValidMountainArray {
	public static boolean isValid(int[] A) {
		
		int left =0;
		int right = A.length -1;
		if(A.length<3)return false;
		while(left<right) {
			
			if(A[left] < A[left+1] ) {
				left++;
				}
			else if(A[right]<A[right-1]) {
				right--;
				}
			else {break;}
		}
			
		return left != 0 && right!=A.length-1 && left == right;
	}

	public static void main(String[] args) {
		int A[] = { 0,1,2,3,4,5,6,7,8,9};
		boolean res = isValid(A);
		System.out.println(res);

	}

}
