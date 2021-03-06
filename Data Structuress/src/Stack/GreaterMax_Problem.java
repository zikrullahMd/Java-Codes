package Stack;
import java.util.*;
public class  GreaterMax_Problem{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> max = new Stack<>();
        System.out.println("1 -> push");
        System.out.println("0 -> pop");
        System.out.println("2 -> greaterMax");
        ArrayList<Integer> list = new ArrayList<>();
        while(n-->0) {
        	int ins = in.nextInt();
        	if(ins == 1) {
        		int e = in.nextInt();
        		st.push(e);
        		if(!max.empty()) {
        			if(e>max.peek()) {
        				max.push(e);
        			}else {
        				max.push(max.peek());
        			}
        		}else {
        			max.push(e);
        		}
        		//greater pop
        	}else if(ins == 0) {
        		if(!st.empty()) {
        			st.pop();
        		}
        	}else if(ins == 2){
        		list.add(max.peek());
        		System.out.println(max.peek());
        	}
        }
        for(int i : list)
        	System.out.print(i+" ");
	}
}
//19 P 10 P 9 g P 8 g P 7 g P 6 g p g p g p g p g p g