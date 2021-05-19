package Problems;
import java.util.*;
public class Pheonix_Balance {
	
	
	static int FrontSum(int[] a, int start, int end) {
		int sum = 0;
		for(int i = start;i<end;i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static int EndSum(int[] a, int start, int end) {
		int sum = 0;
		for(int i = end;i>=start;i--) {
			sum += a[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int[] a = new int[35];
		for(int i = 1;i<=34;i++) {
			a[i] = 2 * i;
		}
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		boolean sorted = Ordering.natural().isOrdered(list);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			
			
			int min = Integer.MAX_VALUE;
			int i = 0;
			int j = n-1;
			ArrayList<Integer> list = new ArrayList<>();
			while(j >= i) {
				int fsum = FrontSum(a,i,n/2);
				int lsum = EndSum(a,j,n/2);
				list.add(Math.abs(fsum - lsum));
				//min = Math.min(min,);
				int f = a[i];
				a[i] = a[j];
				a[j] = f;
				i++;
				j--;
			}
			Collections.sort(list);
			int sum = 0;
			for(int f : list) {
				sum += f;
			}
			System.err.println(sum);
			//System.out.println(min);
		}
		
	}
}
