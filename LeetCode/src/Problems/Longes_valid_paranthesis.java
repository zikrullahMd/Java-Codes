package Problems;
import java.util.*;
public class Longes_valid_paranthesis {
	
	static int countValid(String s) {
		if(s == null || s.length() == 0) return 0;
		Stack<Integer> st = new Stack<>();
		int count = 0;
		st.push(-1);
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			try {
				if(c == '(') {
					st.push(i);
				}
				else if(c == ')') {
					st.pop();
					if(!st.isEmpty()) {
						
						count = Integer.max(count,i-st.peek());
					}else {
						st.push(i);
					}
				}
			}catch(Exception e) {
				
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(countValid(s));
	}

}
