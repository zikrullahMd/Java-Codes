package Minimize_the_absolute_difference;
import java.util.*;
public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int l = in.nextInt();
		int[] A = new int[n];
		int[] B = new int[m];
		int[] C = new int[l];
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		for (int i = 0; i < m; i++) {
			B[i] = in.nextInt();
		}
		for (int i = 0; i < l; i++) {
			C[i] = in.nextInt();
		}
//		int minValue = Integer.MAX_VALUE;
//		for(int i = 0;i<n;i++) {
//			for(int j = 0;j<m;j++) {
//				for(int k = 0;k<l;k++) {
//					int max = Math.max(Math.max(a[i], b[j]), c[k]);
//					int min = Math.max(Math.max(a[i], b[j]), c[k]);
//					minValue = Math.min(Math.abs(max-min), minValue);
//					System.out.println(max);
//					System.out.println(min);
//				}
//			}
//		}
//		System.out.println(minValue);
		
		int i;
		int j;
		int k;
		i = A.length - 1; 
        j = B.length - 1; 
        k = C.length - 1; 
          
        int min_diff, current_diff, max_term; 
  
        // calculating min difference 
        // from last index of lists 
        min_diff = Math.abs(Math.max(A[i], Math.max(B[j], C[k]))  
                  - Math.min(A[i], Math.min(B[j], C[k]))); 
  
        while (i != -1 && j != -1 && k != -1)  
        { 
            current_diff = Math.abs(Math.max(A[i], Math.max(B[j], C[k]))  
                          - Math.min(A[i], Math.min(B[j], C[k]))); 
  
            // checking condition 
            if (current_diff < min_diff) 
                min_diff = current_diff; 
  
            // calculating max term from list 
            max_term = Math.max(A[i], Math.max(B[j], C[k])); 
  
            // Moving to smaller value in the 
            // array with maximum out of three. 
            if (A[i] == max_term) 
                i -= 1; 
            else if (B[j] == max_term) 
                j -= 1; 
            else
                k -= 1; 
        } 
        System.out.println(min_diff);
	}

}
