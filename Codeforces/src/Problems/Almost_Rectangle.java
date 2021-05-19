package Problems;
import java.awt.Point;
import java.util.*;
public class Almost_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			char[][] a = new char[n][n];
			for(int i = 0;i<n;i++) {
				String s = in.next();
				char[] b = s.toCharArray();
				for(int j = 0;j<n;j++) {
					a[i][j] = b[j];
				}
			}
			Point[] p = new Point[2];
			int k = 0;
			for(int i = 0;i<n;i++) {
				for(int j = 0;j<n;j++) {
					if(a[i][j] == '*' && k<p.length) {
						p[k++] = new Point(i,j);
					}
				}
			}
			int x1 = p[0].x;
			int y1 = p[0].y;
			int x2 = p[1].x;
			int y2 = p[1].y;
			if(x1 == x2) {
				if(x1 + 1 < n && x2 + 1 < n) {
					a[x1+1][y2] = '*';
					a[x2+1][y1] = '*';
				}else {
					a[x1-1][y2] = '*';
					a[x2-1][y1] = '*';
				}
				
			}
			else if(y1 == y2) {
				if(y2-1 >= 0 && y1-1 >=0) {
					a[x1][y2-1] = '*';
					a[x2][y1-1] = '*';
				}else {
					a[x1][y2+1] = '*';
					a[x2][y1+1] = '*';
				}
				
			}else {
				a[x1][y2] = '*';
				a[x2][y1] = '*';
			}
			for(int i = 0;i<n;i++) {
				for(int j = 0;j<n;j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
		}
	}

}
