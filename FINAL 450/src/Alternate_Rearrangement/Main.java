package Alternate_Rearrangement;
import java.util.*;
public class Main {
	
	static void printArray(int[] a ) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		// Put all positive element at first and negative at last
		int i = 0;
		int j = n-1;
		while(i<=j) {
			if(a[i] < 0 && a[j] > 0) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
				j--;
			}else if(a[i] > 0 && a[j] < 0) {
				i++;
				j--;
			}else if(a[i] > 0) {
				i++;
			}else if(a[j] < 0) {
				j--;
			}
		}
		int k = 0;
		while(i<n) {
			int t = a[k];
			a[k] = a[i];
			a[i] = t;
			i++;
			k+=2;
		}
		printArray(a);
		
	}

}
