package Merge_Ranges;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] a = new int[2][n];
		for(int i = 0;i<2;i++) {
			for(int j = 0;j<n;j++) {
				a[i][j] = in.nextInt();
			}
		}
		
		Arrays.sort(a, (a1,b) -> Integer.compare(a1[0], b[0]));
		for(int i = 0;i<2;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
