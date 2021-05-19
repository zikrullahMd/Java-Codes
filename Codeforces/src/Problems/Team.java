package Problems;
import java.util.*;
public class Team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		while(n-->0) {
			int p = in.nextInt();
			int v = in.nextInt();
			int t = in.nextInt();
			if( p + v + t >=2) {
				count++;
			}
		}
		System.out.println(count);
	}

}