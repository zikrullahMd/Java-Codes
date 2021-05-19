package Max_In_Array;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,6,3,2,1,4,9,5,6};
		int n = a.length;
		Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println(a[n-1]);
	}

}
