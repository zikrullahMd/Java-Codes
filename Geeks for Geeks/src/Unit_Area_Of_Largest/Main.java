package Unit_Area_Of_Largest;
import java.util.*;
public class Main {

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
		int source = a[0][0];
		int dest = a[n][m];
		System.out.println("Max Area Region "+getRegion(source,dest,a));
	}

	private static int getRegion(int source, int dest, int[][] a) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

}
