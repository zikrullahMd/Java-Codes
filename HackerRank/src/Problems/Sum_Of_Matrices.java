package Problems;
import java.util.*;
public class Sum_Of_Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] a = new int[n][m];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				a[i][j] = in.nextInt();
			}
		}
		for(int j = 0;j<m;j++) {
			int sum = 0;
		for(int i = 0;i<n;i++) {
			sum += a[i][j];
		}
		System.out.println(sum);
		}
		
		
	}

}
