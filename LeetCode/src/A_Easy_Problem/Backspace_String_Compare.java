package A_Easy_Problem;
import java.util.*;
public class Backspace_String_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		
		
		Stack<Character> ss = new Stack<>();
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) != '#') {
				ss.push(s.charAt(i));
			}
			else if(!ss.isEmpty()) {
				ss.pop();
			}
		}
		Stack<Character> ts = new Stack<>();
		for(int i = 0;i<t.length();i++) {
			if(t.charAt(i) != '#') {
				ts.push(t.charAt(i));
			}
			else if(!ts.isEmpty()) {
				ts.pop();
			}
		}
		String ans = "YES";
		while(!ss.isEmpty() && !ts.isEmpty()) {
			if(ss.pop() != ts.pop()) {
				ans = "NO";
				break;
			}
		}
		System.out.println(ans);
	}

}