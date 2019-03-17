package week1;

import java.util.Arrays;


public class PermutationTest {
	public static void main(String[] args) {
		/*int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		long from1 = System.currentTimeMillis();
		Perm(arr, 0, 8);
		long to1 = System.currentTimeMillis();
		long b = to1 - from1;
		long from = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		doPermutation(arr, sb);
		long to = System.currentTimeMillis();
		long a = to - from;
        Permutation2 permutation = new Permutation2();
    	long from2 = System.currentTimeMillis();
        permutation.permutate("123456789");
        long to2 = System.currentTimeMillis();
        long c = to2 - from2;
		System.out.println(a+","+b+","+c);*/
		
		String str = "123456789";
		long from = System.currentTimeMillis();
		Permutation2 permutation = new Permutation2();
		permutation.permutate(str);
		long to = System.currentTimeMillis();
		long from1 = System.currentTimeMillis();
		Permutation1 permutation1 = new Permutation1();
		char[] ch = str.toCharArray();
		StringBuilder pre = new StringBuilder();
		permutation1.doPermutation(ch, pre);
		long to1 = System.currentTimeMillis();
		
		System.out.println("别人的："+ (to - from));
		System.out.println("我的呢："+ (to1 - from1));
		

	}
	public static void doPermutation(int[] arr, StringBuilder pre){
		if(arr.length < 2){
			System.out.println(pre.toString() + arr[0]);
			pre.setLength(pre.length()-1);	
			return;
			
		}else{
			for(int i = 0; i < arr.length; i++){
				pre.append(arr[i]);
				doPermutation(extractedArray(arr, i), pre);
			}
			if(pre.length() > 0)
				pre.setLength(pre.length()-1);
		}
	}
	public static int[] extractedArray(int[] arr, int i){
		if(i == arr.length-1){
			return Arrays.copyOf(arr, arr.length-1);
		}
		int[] temp = arr.clone();
		System.arraycopy(temp, i+1, temp, i, temp.length-i-1);
		return Arrays.copyOf(temp, temp.length-1);
	}	
	public static void Perm(int list[], int k, int m) {
		if (k == m) {
			for (int i = 0; i <= m; i++)
			System.out.print(list[i]);
            System.out.println();
        } else {
            for (int i = k; i <= m; i++) {
                // 从固定的数后第一个依次交换
			    Swap(list, k, i);
			    Perm(list, k + 1, m);
			    // 这组递归完成之后需要交换回来
			    Swap(list, k, i);
            }
        }
	}
	public static void Swap(int[] list, int i, int j) {
	    int t = list[i];
	    list[i] = list[j];
	    list[j] = t;
	}
}
class Permutation2 {
    private char[] data;
    private int length;
   
    public void permutate(String input){
        changeToData(input);
        Arrays.sort(data);
        System.out.println(data);
        while(nextPermutate()){
            System.out.println(data);
        }
    }

    private void changeToData(String input){
        if (input == null){
            return;
        }
        data = input.toCharArray();
        length = input.length();
    }

    private boolean nextPermutate(){
        int end = length - 1;
        int swapPoint1 = end;
        int swapPoint2 = end;
        while(swapPoint1 > 0 && data[swapPoint1] <= data[swapPoint1 -1]){
            swapPoint1--;
        }
        if (swapPoint1 == 0){
            return false;
        }else{
            while (swapPoint2 > 0 && data[swapPoint2] <= data[swapPoint1 - 1]){
                swapPoint2--;
            }
            swap(data, swapPoint1 - 1, swapPoint2);
            reverse(data, swapPoint1, end);
            return true;
        }
    }

    private void swap(char[] data, int left, int right){
        char temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }

    private void reverse(char[] data, int left, int right){
        for (int i = left, j = right; i < j; i++, j--){
            swap(data, i, j);
        }
    }
}
class Permutation1{
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

