package Stack;
import java.util.*;
import java.math.*;
import java.util.Map.Entry;
class Prefix_Postfix{
	
	public static int PostFix(String s) {
		Stack<Integer> st = new Stack<>();
        int res = 0;
        for(int i = 0;i<s.length();i++) {
        	char c = s.charAt(i);
        	if(Character.isDigit(c)) {
        		st.push(c-'0');
        	}
        	else {
        		int one = st.pop();
        		int two = st.pop();
        		switch(c) {
        		case '+' : st.push((one+two));
        		break;
        		case '-' : st.push((one - two));
        		break;
        		case '*' : st.push((one*two));
        		break;
        		case '/' : st.push((Math.max(one, two) / Math.min(one, two)));
        		break;
        		}
        	}
        }
        return st.peek();
	}
	
	public static int PreFix(String s) {
		Stack<Integer> st = new Stack<>();
        int res = 0;
        for(int i = s.length()-1;i>=0;i--) {
        	char c = s.charAt(i);
        	if(Character.isDigit(c)) {
        		st.push(c-'0');
        	}
        	else {
        		int one = st.pop();
        		int two = st.pop();
        		switch(c) {
        		case '+' : st.push((one+two));
        		break;
        		case '-' : st.push((one - two));
        		break;
        		case '*' : st.push((one*two));
        		break;
        		case '/' : st.push((Math.max(one, two) / Math.min(one, two)));
        		break;
        		}
        	}
        }
        return st.peek();
	}
	
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(PreFix(s));
        
    }
}
