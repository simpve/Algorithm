package week1;

public class TestBubble {
	public static void main(String[] args) {
		int[] arr = {59,25,56,123,2,5,1,75,155,8,7,35,100,52,12,545,12,545,12,2,15,123,545,215,152,2,2,1,0,5,152,25,25,35,758,54};
		long start = System.currentTimeMillis();
		ImprovedBubble bubb = new ImprovedBubble(arr);
		bubb.printArr();
		bubb.template();
		bubb.printArr();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
	}

}
