package ArrayEasyLeetcode;

import java.util.Arrays;

public class ArrayTransformation {
	public static int[] transform(int [] prev) {
	
		
		int [] cur = Arrays.copyOf(prev, prev.length);
		boolean status=true;
		//System.out.println(Arrays.toString(cur));
		while(status) {
			status=false;
              for(int i=1;i<prev.length-1;i++) {
				if(prev[i]<prev[i-1] && prev[i]<prev[i+1]) {
					cur[i]=prev[i]+1;
					status=true;
					//System.out.println(Arrays.toString(cur));
				}
				else if(prev[i]>prev[i-1] && prev[i]>prev[i+1]) {
					cur[i]=prev[i]-1;
					status=true;
					//System.out.println(Arrays.toString(cur));
				}
				
			}
              prev=cur;
		}
			
		
          return cur;
	}

	public static void main(String[] args) {
		int[] arr = {1,0,3,4,3,5};
		System.out.println(Arrays.toString(arr));
		int[] result = transform(arr);
		
		System.out.println("---------");
		System.out.println(Arrays.toString(result));

	}

}
