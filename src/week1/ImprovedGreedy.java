package week1;

import java.util.Arrays;

public class ImprovedGreedy {
	public static void main(String[] args) {
		int[] arr = {59,25,56,123,2,5,1,75,155,8,7,35};
		System.out.println(Arrays.toString(arr));
		for(int k = 1 ; k < arr.length ; k++){
			for(int i = k ; 0 < i && arr[i-1] > arr[i] ; i--){
				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
