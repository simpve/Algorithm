package week1;

import java.util.Arrays;

public class Bubble {
	private int[] arr;
	private int lo;
	private int hi;
	public Bubble(int[] arr){
		this.arr = arr;
		hi = arr.length;
	}
	
	public void template(){
		while(lo<hi)
			bubble(lo,hi--);
	}
	public void bubble(int lo,int hi){ 
		while(++lo < hi)
			if(arr[lo-1] > arr[lo]){
				arr[lo] = arr[lo]^arr[lo-1];
				arr[lo-1] = arr[lo]^arr[lo-1];
				arr[lo] = arr[lo]^arr[lo-1];
			}
	}
	public void printArr(){
		System.out.println(Arrays.toString(arr));
	}
}
