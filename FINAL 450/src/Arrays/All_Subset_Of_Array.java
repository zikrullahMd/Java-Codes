package A_Problems;
import java.util.*;
public class All_Subset_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a= new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for(int i = 0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
