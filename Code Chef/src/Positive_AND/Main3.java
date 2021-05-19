package Positive_AND;

import java.util.*;

public class Main3 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] a = new int[100000];
		
		for(int i = 3; i<a.length; i++) {
			a[i] = i+1;
		}
		
		for(int i = 4; i<a.length; i*=2) {
			int temp = a[i-1];
			a[i-1] = a[i];
			a[i] = temp;
		}
		a[0] = 2;
		a[1] = 3;
		a[2] = 1;
		System.out.println();
		while(t-->0) {
			int n = in.nextInt();
			if(n==1) {
			    System.out.println(1);
				continue;
			}
			if((n&(n-1))==0) {
				System.out.println(-1);
				continue;
			}
			for(int i = 0; i<n; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}

}