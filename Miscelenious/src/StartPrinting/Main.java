package StartPrinting;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<(n-i);j++) {
				System.out.print(" ");
			}
			for(int j = 0;j<(2*i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
