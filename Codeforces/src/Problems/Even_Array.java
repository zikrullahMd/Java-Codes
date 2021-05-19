package Problems;
import java.util.*;
public class Even_Array {
	
	public static boolean areSame(int[] a)
    {
       Integer first = a[0];
       for (int i=1; i<a.length; i++)
           if (a[i] != first)
                return false;
       return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a= new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
			}
			int fine = 0;
			int even = 0;
			int odd = 0;
			for(int i = 0;i<n;i++) {
				if(i % 2 == 0) {
					if(a[i] % 2 == 0) {
						fine++;
					}else {
						even++;
					}
				}else {
					if(a[i] % 2 != 0) {
						fine++;
					}else {
						odd++;
					}
				}
			}
			if(fine == n) {
				System.out.println(0);
			}else if(even == odd) {
				System.out.println(even);
			}else {
				System.out.println(-1);
			}
			
		}
	}

}
