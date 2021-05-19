package ProductOfArrayExceptSelf;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0;i<n;i++)
			a[i] = in.nextInt();
		int mul = 1;
		for(int i = 0;i<n;i++) {
			mul = mul * a[i];
		}
		for(int i = 0;i<n;i++) {
			b[i] = mul / a[i];
		}
		for(int i = 0;i<n;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
//Correct