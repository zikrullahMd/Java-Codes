package Problems;
import java.util.*;
public class SubString_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String p = in.next();
		if(s.contains(p)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
