package Problems;
import java.util.*;
public class OddDevisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			long n = in.nextLong();
			if(n % 6 == 0 || n % 2 == 1) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
