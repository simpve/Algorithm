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
	//���Ԫ�ظ���
	public int getLength(){
		return top+1;
	}
	//��ջ����
	public int pop(){
		return  s[top--];
	}
	//��ջ����
	public boolean push(int x){
		if(top==total){
			return false ;
		}else{
			s[++top] = x;
			return true;
		}
	}
	//�ж�ջ�Ƿ�Ϊ��
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
