package week1;

import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class TestHuffman {

	public static void main(String[] args) throws InterruptedException {
		CharCode cc = new CharCode();
		CharCode[] charArray = cc.getCharArray();
		System.out.println(Arrays.toString(charArray));
		//对数组进行排序
		Arrays.sort(charArray);
		System.out.println(Arrays.toString(charArray));
		Stack<CharCode> huffStack = new Stack<CharCode>();
		for (CharCode charCode : charArray) {
			huffStack.push(charCode);
		}
		LinkedBlockingQueue<CharCode> huffQueue = new LinkedBlockingQueue<CharCode>();
		while(!huffStack.isEmpty() || !huffQueue.isEmpty()){
			//假如栈为空，此时元素都在队列中，且个数>=2。
			if(huffStack.isEmpty()){
				huffQueue.add(new CharCode(' ',huffQueue.take().getFreq() + huffQueue.take().getFreq()));
			}
			//如若队列为空，此时元素全部在栈中，对应程序刚开始
			else{
				CharCode temp1 = huffStack.pop();
				temp1.CompleteCode(0);
				CharCode temp2 = huffStack.pop();
				temp2.CompleteCode(1);
				huffQueue.add(new CharCode(' ',huffStack.pop().getFreq() + huffStack.pop().getFreq()));
			}
		}
		
	}

}
@SuppressWarnings("rawtypes")
class CharCode implements Comparable{
	
	private char ch;
	private int freq;
	private String code;
	public CharCode(){
		
	}
	public CharCode(char ch, int freq) {
		super();
		this.ch = ch;
		this.freq = freq;
	}
	public CharCode[] getCharArray(){
		CharCode[] arr = {
				new CharCode('a',511),
				new CharCode('b',146),
				new CharCode('c',209),
				new CharCode('d',203),
				new CharCode('e',840),
				new CharCode('f',132),
				new CharCode('g',133),
				new CharCode('h',249),
				new CharCode('i',459),
				new CharCode('j',6),
				new CharCode('k',31),
				new CharCode('l',320),
				new CharCode('m',201),
				new CharCode('n',437),
				new CharCode('o',565),
				new CharCode('p',157),
				new CharCode('q',4),
				new CharCode('r',425),
				new CharCode('s',531),
				new CharCode('t',670),
				new CharCode('u',242),
				new CharCode('v',47),
				new CharCode('w',141),
				new CharCode('x',26),
				new CharCode('y',143),
				new CharCode('z',2),	
		};
		return arr;
	}
	@Override
	public int compareTo(Object o) {
		CharCode cc = (CharCode) o;
		return cc.freq-this.freq;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	public int getFreq() {
		return freq;
	}
	public void setFreq(int freq) {
		this.freq = freq;
	}
	public String getCode() {
		return code;
	}
	public void CompleteCode(int x){
		this.code+=x;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String toString(){
		return this.ch+" "+this.freq;
	}

}

