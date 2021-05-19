package Problems;
import java.util.*;
public class Number_Line_Jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		try {
			if(x1 != x2 && v2 > v1) {
				System.out.println("NO");
				return;
			}
			if((x2-x1)%(v2-v1) != 0) {
				System.out.println("NO");
				return;
			}
			System.out.println("YES");
		}catch(Exception e) {
			System.out.println("YES");
		}
	}

}
