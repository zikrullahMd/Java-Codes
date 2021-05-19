package Problems;
import java.util.*;
public class Caps_Lock {
	
	static String ChangeFirst(String s) {
		String ans = "";
		char first = Character.toUpperCase(s.charAt(0));
		ans = first + s.substring(1, s.length()).toLowerCase();
		
		return ans;
		
	}
	
	static String ChangeAgain(String s) {
		return s.toLowerCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		if(Character.isLowerCase(s.charAt(0)) && s.substring(1, s.length()).equals(s.substring(1, s.length()).toUpperCase())) {
			String a = ChangeFirst(s);
			System.out.println(a);
		}
		else if(s.equals(s.toUpperCase())){
			String a = ChangeAgain(s);
			System.out.println(a);
		}
		else {
			System.out.println(s);
		}
	}

}
