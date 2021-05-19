package RotateArrayByOne;
import java.util.*;
public class Main {
	
	static void RotateArray(int[] a , int n) {
		int[] f = new int[n];
		int k = 0;
		for(int i = 1;i<n;i++) {
			f[k++] = a[i];
		}
		f[n-1] = a[0];
		for (int i = 0; i < f.length; i++) {
			System.out.print(f[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		RotateArray(a,n);
	}

}
