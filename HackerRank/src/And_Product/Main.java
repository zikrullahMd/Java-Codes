package And_Product;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] a = new int[201];
		a[0]=1;
		for(int i = 1;i<a.length;i++){
		    //a[i]    //no of special bits in numbers 1....i
		    //a[i-1]  //no of special bits in numbers 1....i-1
		    a[i] = i-1 & i;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		int t = in.nextInt();
		while(t-->0) {
			int l = in.nextInt();
			int r = in.nextInt();
			System.out.println(a[r]-a[l-1]);
		}

	}

}
