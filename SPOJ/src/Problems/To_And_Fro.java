package Problems;
import java.util.*;
public class To_And_Fro {
	
 
	static char[] Rev(char[] a, int n){
    	int i, k;
    	char t;
        for (i = 0; i < n / 2; i++) { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
        return a;
  }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int col;
		while((col = in.nextInt()) != 0) {
			String s = in.next().toLowerCase();
			int row = s.length()/col;
			char[][] a = new char[row][col];
			int k = 0;
			for(int i = 0;i<row;i++) {
				for(int j = 0;j<col;j++) {
					a[i][j] = s.charAt(k);
					k++;
				}
			}
			if( col % 2 == 0) {
				for(int i = 0;i<row;i++) {
					if(i % 2 == 0) {
						for(int j = 0;j<col;j++) {
							a[i] = Rev(a[i],col);
						}
					}
				}
			}else {
				for(int i = 0;i<row;i++) {
					if(i % 2 == 1) {
						for(int j = 0;j<col;j++) {
							a[i] = Rev(a[i],col);
						}
					}
				}
			}
			
			String ans = "";
			int j = 0;
			for(j = 0;j<col;j++) {
				for(int i = 0;i<row;i++) {
					ans += a[i][j];
				}
			}
			System.out.println(ans);
			}
		}
 
}