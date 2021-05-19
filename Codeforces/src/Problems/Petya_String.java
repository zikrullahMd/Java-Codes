package Problems;
import java.util.*;
public class Petya_String {
	
	static int Check(String a, String b) {
		int count = 0;
		for(int i = 0;i<a.length();i++) {
			if(a.charAt(i) > b.charAt(i)) {
				return 1;
			}else if(a.charAt(i) < b.charAt(i)) {
				return -1;
			}else {
				count++;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next().toLowerCase();
		String p = in.next().toLowerCase();
		System.out.println(Check(s,p));
		
	}

}
