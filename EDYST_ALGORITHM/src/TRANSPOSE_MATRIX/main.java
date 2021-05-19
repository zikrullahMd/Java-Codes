package TRANSPOSE_MATRIX;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j]  = in.nextInt();
			}
		}
		int[][] trans = new int[n+1][m+1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				trans[i][j] = a[j][i];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
	}	

}
