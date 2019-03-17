package week1;

import java.util.Arrays;

public class ImprovedBubble {
	private int[] arr;
	private int lo;
	private int hi;
	private int last;
	public ImprovedBubble(int[] arr){
		this.arr = arr;
		hi = arr.length;
	}
	
	public void template(){
		while(lo<(hi=bubble(lo,hi--)));
	}
	public int bubble(int lo,int hi){
		last = lo;
		while(++lo < hi){
			if(arr[lo-1] > arr[lo]){
				last = lo;
				arr[lo] = arr[lo]^arr[lo-1];
				arr[lo-1] = arr[lo]^arr[lo-1];
				arr[lo] = arr[lo]^arr[lo-1];
			}
		}
		return last;
	}
	public void printArr(){
		System.out.println(Arrays.toString(arr));
	}
}
