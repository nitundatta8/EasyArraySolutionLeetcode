package ArrayEasyLeetcode;

public class MonotonicArray {
public static boolean isMonotonic(int [] arr) {
	boolean dec=true;
	boolean inc=true;
	for(int i=0;i<arr.length -1;i++) {
		if(arr[i]<arr[i+1]) {
			dec=false;
		}
		if(arr[i]>arr[i+1]) {
			inc=false;
		}
		
	}
	
	return inc || dec;
}
	public static void main(String[] args) {
		int [] arr= {5,3,3};
		
		boolean result=isMonotonic(arr);
		System.out.println(result);
	}

}
