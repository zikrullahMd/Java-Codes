package Encryption;
import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		s = s.replaceAll("\\s", "");
		int n = s.length();
		int r = (int)Math.sqrt(n);
		int c = r + 1;
		if(r*c <= n) {
			r = c;
		}
		int k = 0;
		char[][] a = new char[r][c];
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				if(k < n) {
					a[i][j] = s.charAt(k++);
				}else {
					break;
				}
			}
		}
		
		int f = 0;
		String ans = "";
		for(int i = 0;i<c;i++) {
			for(int j = 0;j<r;j++) {
				//System.out.print(a[j][i]);
				if(a[j][i] != ' ') {
					ans += a[j][i];
				}
				
			}
			System.out.print("");
		}
		System.out.println(ans);
	}

}
