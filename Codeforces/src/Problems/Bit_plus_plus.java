package Problems;
import java.util.*;
public class Bit_plus_plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = 0;
		while(n-->0) {
			String s = in.next();
			if(s.charAt(0) == '+' || s.charAt(s.length()-1) == '+') {
				x++;
			}else {
				x--;
			}
		}
		System.out.println(x);
	}

}
