package week0;

public class MyStack {
	private int[] s;
	private int total;
	private int top;
	public MyStack(int total){
		s = new int[total];
		this.total= total;
		top = -1;
	}
	//获得元素个数
	public int getLength(){
		return top+1;
	}
	//出栈操作
	public int pop(){
		return  s[top--];
	}
	//入栈操作
	public boolean push(int x){
		if(top==total){
			return false ;
		}else{
			s[++top] = x;
			return true;
		}
	}
	//判断栈是否为空
	public boolean isEmpty(){
		return -1==top;
	}
	
	public int getTop(){
		return s[top];
	}
	
	public String toString(){
		String ss = "[";
		for (int i = 0; i <= top; i++) {
			ss+=(" "+s[i]+" ");
		}
		ss+="]";
		return ss;
	}
}
