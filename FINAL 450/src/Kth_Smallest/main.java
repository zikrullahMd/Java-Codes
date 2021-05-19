package Kth_Smallest;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] a = {7 ,10, 4, 3 ,20, 15};
		int n = a.length;
		int k = in.nextInt();
		Arrays.sort(a);
		System.out.println(a[k-1]);
	}

}
