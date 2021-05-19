package Positive_AND;
import java.util.*;
public class Main2 {
	static void swap(int x, int y, int[] a)  
	{  
	      
	    a[x] = a[x] ^ a[y];  
	  
	    a[y] = a[x] ^ a[y];  
	  
	    a[x] = a[x] ^ a[y];  
	    
	    
	} 
	static int[] rearrangeArray(int a[], int n)  
	{  
		for(int i = 4;i<n;i=i*2){
				swap(i-1,i,a);
		}
		return a;
	}
	static boolean PowerOfTwoBinary(int x) {
		if((x & x-1) == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] a = new int[100001];
		a[0] = 2;
		a[1] = 3;
		a[2] = 1;
		for(int i = 3;i<a.length;i++){
			a[i] = i+1;
		}
		int[] b = new int[a.length];
		b = rearrangeArray(a,a.length);
		while(t-->0) {
			int n = in.nextInt();
			if(n == 1) {
				System.out.println(1);
				continue;
			}
			if(PowerOfTwoBinary(n)) {
				System.out.println(-1);
				continue;
			}
			for(int i = 0;i<n;i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println();
		}
	}

}