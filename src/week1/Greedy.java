package week1;

import java.util.Arrays;

public class Greedy {
	public static void main(String[] args) {
		int[] arr = {59,25,56,123,2,5,1,75,155,8,7,35};
		System.out.println(Arrays.toString(arr));
		for(int i = 1 ;i < arr.length ;){
			if( i<1 || arr[i-1] <= arr[i] ){
				i++;
			}else{
/*				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;*/
				arr[i] = arr[i]^arr[i-1];
				arr[i-1] = arr[i]^arr[i-1];
				arr[i] = arr[i]^arr[i-1];
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}		
}
