package Problems;

import java.awt.Point;
import java.util.*;
public class Card_Codeforces_107{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			long n = in.nextLong();
			long q = in.nextLong();
			Point[] a = new Point[(int)n];
			long[] b = new long[(int)q];
			for(int i = 0;i<n;i++) {
				a[i] = new Point(in.nextInt(),i+1);
			}
			for(int j = 0;j<q;j++) {
				b[(int)j] = in.nextLong();
			}
			for(int i = 0;i<q;i++) {
				int target = (int)b[i];
				for(int j = 0;j<n;j++) {
					if(a[j].x == target) {
						System.out.print(a[j].y+" ");
						a[j].y = 1;
						break;
					}else {
						a[j].y += 1;
					}
				}
			}
	}
}