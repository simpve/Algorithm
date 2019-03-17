package week1;

import java.util.Arrays;

public class TestGreedy {
	public static void main(String[] args) {
		int[] arr = {59,25,56,123,2,5,1,75,155,8,7,35};	
		for (int i = 0; i < arr.length-1;) {
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				i = i>0?i-1:i+1;
			}else{
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
		
}
