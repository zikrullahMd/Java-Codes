package Codeforces_750;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		long t = in.nextLong();
		while(t-->0) {
			long n = in.nextLong();
			long m = in.nextLong();
			long x = in.nextLong();
			long row = x % n;
			if(row == 0) {
				row = n;
			}
			long col = x / n;
			if(col < 1) {
				col = 1;
			}
			if(x % n == 0) {
				col = x/n;
			}else {
				col = x/n + 1;
			}
			//System.out.println("row "+row +" "+"col "+col);
			long ans = (row-1) * m + col;
			System.out.println(ans);
		}
	}

}
