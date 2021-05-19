package CodeLite;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		Set<Character> set = new HashSet<>();
		for(int i = 0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		if(set.size()==s.length()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}