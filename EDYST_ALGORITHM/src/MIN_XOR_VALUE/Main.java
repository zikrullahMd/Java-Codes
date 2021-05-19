package MIN_XOR_VALUE;
import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<n-1;i++) {
			int xor = a[i] ^ a[i+1];
			min = Math.min(min, xor);
		}
		System.out.println(min);
	}

}
