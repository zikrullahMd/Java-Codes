package Problems;
import java.util.*;
public class Beautifull_Matrix {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int[][] a = new int[6][6];
			int x = 0;
			int y = 0;
			for(int i = 1;i<=5;i++) {
				for(int j = 1;j<=5;j++) {
					a[i][j] = in.nextInt();
					if(a[i][j] == 1) {
						x = i;
						y = j;
					}
				}
			}
			int ans = Math.abs(3-x) + Math.abs(3 - y);
			System.out.println(ans);
		}
}
