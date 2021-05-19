package Positive_Prefixe;
import java.util.*;
public class Main {
	
	static void printArray(int[] a, int n) {
		for (int i = 1; i <=n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n+1];
			for(int i = 1;i<=n;i++) {
				a[i] = i;
			}
			int r = n - k;
			for(int i = 1;i<=n&&r>0;i+=2) {
				
					a[i] -= 2 * a[i];
					r--;
			}
			int i = n;
			while(r > 0) {
				if(a[i]>0) {
					a[i] -= 2 * a[i];
					r--;
				}
				i--;
			}
			
			printArray(a,n);
			
		}
		
	}

}
