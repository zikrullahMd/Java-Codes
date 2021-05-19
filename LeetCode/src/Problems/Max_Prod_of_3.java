package Problems;
import java.util.*;
public class Max_Prod_of_3 {
	
	static int maximumProduct(int[] a) {
		int prod = 0;
		int n = a.length;
		Arrays.sort(a);
		prod = Math.max(a[0]*a[1]*a[n-1], a[n-1]*a[n-2]*a[n-3]);
		
		
		
		
		
		
		return prod;
	}

	public Max_Prod_of_3() {
		// TODO Auto-generated constructor stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		System.out.println(maximumProduct(a));
		
	}

}
