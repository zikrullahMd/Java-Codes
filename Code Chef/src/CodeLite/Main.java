package CodeLite;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		char[] sa = s.toCharArray();
		char[] ta = s.toCharArray();
		Arrays.sort(sa);
		Arrays.sort(ta);
		String sone = new String(sa);
		String stwo = new String(ta);
		if(sone.compareTo(stwo) == 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
