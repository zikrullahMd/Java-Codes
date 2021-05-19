package Codevita_round2;
import java.util.*;
public class Infected_cells {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int[][] a = new int[r][c];
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				a[i][j] = in.nextInt();
			}
		}
		int scount = 0;
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				if(a[i][j] == 6) {
					scount++;
				}
			}
		}
		int sqcount = 0;
		int reccount = 0;
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				if(a[i][j] == 6) {
					int v = 0;
					int h = 0;
					int a = 0;
					int b = 0;
					while(a[i][j] == 6) {
						
					}
				}
			}
		}
	}

}
