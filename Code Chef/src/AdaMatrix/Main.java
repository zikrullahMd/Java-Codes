package AdaMatrix;
import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0;i<n;i++) {
				for(int j = 0;j<n;j++) {
					a[i][j] = in.nextInt();
				}
			}
			int l;
			int count = 0;
			int ans = 0;
			for(l = n-1;l>0;l--) {
				if(check(a) == true) {
					ans = count;
				}else {
					a = trans(a,l);
					count++;
				}
			}
			System.out.println(count);
		}
	}
	static int[][] trans(int a[][] , int l){
		int[][] trans = new int[l][l];
		for(int i = 0;i<l;i++) {
			for(int j = 0;j<l;j++) {
				trans[i][j] = a[j][i];
			}
		}
		return trans;
	}
	static boolean check(int a[][]) {
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a.length;j++) {
				int temp = ((i-1)*a.length) + j;
				if(a[i][j] != temp) {
					return false;
				}
			}
		}
		return true;
	}

}
