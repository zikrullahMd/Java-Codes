package Max_Value;
import java.util.*;
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
		long mul = 1;
		for(int i = 0;i<5;i++) {
			mul = mul * a[i];
		}
		System.out.println(mul);
	}

}
