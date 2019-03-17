package week1;

import java.util.Arrays;

public class TestPermutation {
	public static void main(String[] args) {
		Permutation pt = new Permutation();
/*		System.out.println(pt.num.length);
		System.out.println(pt.extractedArray(pt.num, 1));
		System.out.println(pt.num.length);*/
		String str = "12345";
		char arr[] = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		pt.doPermutation(arr, sb);
/*		int[] newArr = pt.extractedArray(arr, 1);
		for (int i : newArr) {
			System.out.print(i);
		}*/
	}
}

class Permutation{
	public void doPermutation(char[] arr, StringBuilder pre){
		if(arr.length < 2){
			System.out.println(pre.toString() + arr[0]);
			pre.setLength(pre.length()-1);	
			return;
			
		}else{
			for(int i = 0; i < arr.length; i++){
				pre.append(arr[i]);
				this.doPermutation(extractedArray(arr, i), pre);
			}
			if(pre.length()<=0){
				return;
			}pre.setLength(pre.length()-1);
		}
	}
	public char[] extractedArray(char[] arr, int i){
		if(i == arr.length-1){
			return Arrays.copyOf(arr, arr.length-1);
		}
		char[] temp = arr.clone();
		System.arraycopy(temp, i+1, temp, i, temp.length-i-1);
		return Arrays.copyOf(temp, temp.length-1);
	}
}

