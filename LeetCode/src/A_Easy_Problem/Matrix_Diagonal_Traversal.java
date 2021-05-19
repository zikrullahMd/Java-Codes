package A_Easy_Problem;

import java.util.Arrays;
import java.util.Comparator;

public class Matrix_Diagonal_Traversal{
	public int[] findDiagonalOrder(int[][] m) {
		if(m.length == 0) {
			int a[] = new int[0];
			return a;
		}
		int[][] arrd = new int[m.length*m[0].length][3];
		int[] res = new int[arrd.length];
		int index = 0;
		for(int i = 0;i<m.length;i++) {
			for(int j = 0;j<m[0].length;j++) {
				arrd[index++] = new int[]{i+j,j,m[i][j]};
			}
		}
		Arrays.sort(arrd, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if(a[0] != b[0]) {
					return a[0] - b[0]; 
				}
				if(a[0]%2 != 0) {
					return -(a[1]-b[1]);
				}else {
					return a[1]-b[1];
				}
			}
		});
		for(int i = 0;i<arrd.length;i++) {
			res[i] = arrd[i][2];
		}
		return res;
		
	}
}