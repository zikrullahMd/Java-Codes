package Balanced_Paranthases;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        if(s.length() % 2 != 0) {
        	System.out.println("Not Balanced");
        	return;
        }
        Stack<Character> st = new Stack<>();
        boolean balanced = true;
        for(int i = 0;i<s.length();i++) {
        	if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
        		st.push(s.charAt(i));
        		continue;
        	}
        	else if(s.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{') {
    			st.pop();
    		}
        	else if(s.charAt(i) == ']' && !st.isEmpty() && st.peek() == '[') {
    			st.pop();
    		}
        	else if(s.charAt(i) == ')' && !st.isEmpty() && st.peek() == '(') {
    			st.pop();
    		}else {
    			System.out.println("Not Balanced");
    			return;
    		}
        }
        Queue<Integer> q;
        System.out.println(st.empty() ? "Balanced" : "Not Balanced");
        
	}
}
