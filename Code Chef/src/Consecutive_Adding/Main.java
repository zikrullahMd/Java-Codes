package Consecutive_Adding;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t-->0) {
			long r = in.nextLong();
			long c = in.nextLong();
			long x = in.nextLong();
			long[][] a = new long[(int)r][(int)c];
			long[][] b = new long[(int)r][(int)c];
			for(long i = 0;i<r;i++) {
				for(long j = 0;j<c;j++) {
					a[(int)i][(int)j] = in.nextLong();
				}
			}
			for(int i = 0;i<r;i++) {
				for(int j = 0;j<c;j++) {
					if(a[i][j] == b[i][j]) continue;
					for(int k = i;k<x;k++) {
						a[i][k] -= b[i][j] - a[i][j];
					}
					
				}
			}
			
		}
	}

}
