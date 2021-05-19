package Problems;
import java.util.*;
public class Bear_and_BigBro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if(a > b) {
			System.out.println(0);
			return;
		}
		int count = 0;
		while(a <= b) {
			count++;
			a *= 3;
			b *= 2;
		}
		System.out.println(count);
	}

}
