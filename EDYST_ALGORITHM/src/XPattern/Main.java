package XPattern;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String rev = new StringBuilder(s).reverse().toString();
		int n = s.length();
		if(s.length() % 2 == 0) {
			System.out.println("INVALID");
		}else {
			for(int i = 0;i<n;i++) {
				//int k = n - 1 - i;
				for(int j = 0;j<n;j++) {
					if(j == i || i+j+1==n) {
						System.out.print(s.charAt(j));
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}

}
