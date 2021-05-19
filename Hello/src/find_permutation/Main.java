package find_permutation;

import java.util.*;
public class Main {
	
	public static void Swap(int[] a, int k , int l) {
		int temp = a[k];
		a[k] = a[l];
		a[l] = temp;
	}

	public static void Reverse(int[] a, int s) {
		int i = s;
		int j = a.length-1;
		while(i<j) {
			Swap(a,i++,j--);
		}
	}
	// -----------------------------------------------------------------------------------------
	public static int[] getPrev(int[] a, int n) {
		int k = -1;
		for(int i = 0;i<n-1;i++) {
			if(a[i] > a[i+1]) {
				k = i;
			}
		}
		

		if(k == -1) {
//			for(int i = 0;i<n;i++) {
//				System.out.print(a[i]+" ");
//			}
//			System.out.println();
			return a;
		}
		int l = 0;
		for(int i = k+1;i<n;i++) {
			if(a[k] > a[i]) {
				l = i;
			}
		}
		Swap(a,k,l);
		Reverse(a,k+1);
		return a;
	}
	// -------------------------------------------------------------------
	public static int[] getnext(int[] a, int n) {
		int k = -1;
		for(int i = 0;i<n-1;i++) {
			if(a[i] < a[i+1]) {
				k = i;
			}
		}
		

		if(k == -1) {
//			for(int i = 0;i<n;i++) {
//				System.out.print(a[i]+" ");
//			}
//			System.out.println();
			return a;
		}
		int l = 0;
		for(int i = k+1;i<n;i++) {
			if(a[k] < a[i]) {
				l = i;
			}
		}
		Swap(a,k,l);
		Reverse(a,k+1);
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = i+1;
		}
		String s = in.next();
		
		for(int i = s.length();i<=0;i--) {
			char c = s.charAt(i);
			if(c == 'I') {
				a = getnext(a,n);
			}else if(c == 'D') {
				a = getPrev(a,n);
			}
		}
		for(int i : a) {
			System.out.print(i+" ");
		}
	}

}

