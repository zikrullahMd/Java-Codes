package Stack;
import java.util.*;
public class StackImplementation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Stack st = new Stack();
		System.out.println(st.size());
		
	}

}

class Stackk{
	int max = 1000000;
	int[] st = new int[max];
	int index;
	
	public Stackk() {
		index = -1;
	}
	
	public boolean isEmpty() {
		return index<0;
	}
	
	public int size() {
		return index+1;
	}
	
	public boolean push(int  x) {
		if(index >= (max-1)) {
			System.out.println("Stack Overflow");
			return false;
		}else {
			st[++index] = x;
			return true;
		}
	}
	
	public int pop() {
		if(index < 0) {
			System.out.println("Stack Underlflow");
			return -1;
		}else {
			int x = st[index--];
			return x;
		}
	}
	
	public int peek() {
		if(index < 0) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int x = st[index];
		return x;
	}
	
	public void printStack() {
		while(isEmpty()) {
			System.out.println(pop());
		}
	}
	
}
