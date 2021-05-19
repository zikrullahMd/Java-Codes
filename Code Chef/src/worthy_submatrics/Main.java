package worthy_submatrics;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int m = in.nextInt();
			int k = in.nextInt();
			int[][] a = new int[n][m];
			for(int i = 0;i<n;i++) {
				for(int j = 0;j<m;j++) {
					a[i][j] = in.nextInt();
				}
			}
			
		}
	}

}
