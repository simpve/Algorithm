package week1;

public class test {
	public static void main(String[] args) {
		int a = 15;
		int b = 20;
		a^=b^=a^=b;
		System.out.println(a+","+b);
	}
}
