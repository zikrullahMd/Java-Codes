package medium_Problem;
import java.util.*;
import java.awt.Point;

public class Set_matrix_zeros {

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
		ArrayList<Point> list = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(a[i][j] == 0)
					list.add(new Point(i,j));
			}
		}
		System.out.println(list);
		for(Point k : list) {
			int row = k.x;
			int col = k.y;
			for(int i = 0;i<m;i++) {
				a[row][i] = 0;
			}
			for(int i = 0;i<n;i++) {
				a[i][col] = 0;
			}
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
