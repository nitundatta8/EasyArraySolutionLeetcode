package ArrayEasyLeetcode;

import java.util.Arrays;

public class ArrayTransformTemp {
public static int[] transform(int [] prev) {
	boolean status=true;
		int temp = prev[0];
		//System.out.println(Arrays.toString(cur));
		while(status) {
			status=false;
              for(int i=1;i<prev.length-1;i++) {
				if(prev[i]<temp && prev[i]<prev[i+1]) {
					temp=prev[i];
					prev[i]++;
					status=true;
					//System.out.println(Arrays.toString(prev));
				}
				else if(prev[i]>temp && prev[i]>prev[i+1]) {
					temp=prev[i];
					prev[i]--;
					status=true;
					//System.out.println(Arrays.toString(prev));
				}
				
			}
              
		}
			
		
          return prev;
	}

	public static void main(String[] args) {
		int[] arr = {1,6,3,4,3,5};
		System.out.println(Arrays.toString(arr));
		int[] result = transform(arr);
		
		System.out.println("---------");
		System.out.println(Arrays.toString(result));

	}

}
