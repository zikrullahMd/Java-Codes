package Problems;
import java.util.*;
public class George_Accomodation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		for(int i = 0;i<n;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			if(Math.abs(a-b) >= 2) {
				count++;
			}
		}
		System.out.println(count);
	}

}
