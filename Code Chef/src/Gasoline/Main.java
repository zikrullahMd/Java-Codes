package Gasoline;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] c = new int[n];
			for (int i = 0; i < n; i++) {
				c[i] = in.nextInt();
			}
			int x = c[0];
			int g = 0;
			int i = 1;
			while(x != 0) {
				if(i == n) {
					i = 1;
				}
				x -= 1;
				x += c[i];
				c[i++] = 0;
				g++;
			}
			System.out.println(g);
		}
	}

}
