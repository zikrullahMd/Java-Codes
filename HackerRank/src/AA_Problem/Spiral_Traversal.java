package AA_Problem;
import java.util.*;
public class Spiral_Traversal {
	static void printSpiral(int m, int n, int a[][]) 
    { 
        int i, top = 0, left = 0; 
  
        while (top < m && left < n) { 
            
            for (i = left; i < n; ++i) { 
                System.out.print(a[top][i] + " "); 
            } 
            top++; 
  
            
            for (i = top; i < m; ++i) { 
                System.out.print(a[i][n - 1] + " "); 
            } 
            n--; 
  
           
            if (top < m) { 
                for (i = n - 1; i >= left; --i) { 
                    System.out.print(a[m - 1][i] + " "); 
                } 
                m--; 
            } 
            if (left < n) { 
                for (i = m - 1; i >= top; --i) { 
                    System.out.print(a[i][left] + " "); 
                } 
                left++; 
            } 
        } 
    } 

	public static void main(String[] args) {
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
			printSpiral(n,n,a);
			System.out.println();
		}
	}

}
