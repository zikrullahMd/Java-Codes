package two_stack_in_one_array;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1/0);
	}

}

class TwoStack{
	int size = 1000000;
	int[] st = new int[size];
	int t1 = -1;
	int t2 = size;
	
	public boolean push1(int x) {
		if(t1 < t2) {
			st[++t1] = x;
			return true;
		}else {
			System.out.println("Stack Overflow");
			return false;
		}
	}
	public boolean push2(int x) {
		if(t1 < t2) {
			st[--t2] = x;
			return true;
		}else {
			System.out.println("Stack Overflow");
			return false;
		}
	}
	
}