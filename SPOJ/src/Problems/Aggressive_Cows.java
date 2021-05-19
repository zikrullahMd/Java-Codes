package Problems;
import java.util.*;
public class Aggressive_Cows {
	static int min = Integer.MAX_VALUE;
	static int Solve(int[] a, int n , int k , int min , int max) {
		int low = min;
		int high = max;
		while(low<=high) {
			int mid = (low + high)/2;
			if(isValid(a,k,mid) > 0) {
				low = mid + 1;
				min  = Integer.min(min,isValid(a,k,mid));
			}else {
				high = mid + 1;
			}
		}
	}
	static int isValid(int[] a, int k , int tocheck) {
		int count = 0;
		int sum = 0;
		try {
			for(int i = 0;i<a.length && i<=k;i++) {
				count++;
				i = nextGreaterElement(a,a.length,i+tocheck);
			}
		}catch(Exception E) {
			return -1;
		}
	}
	
	static int nextGreaterElement(int[] a, int n, int key) {
		
		int low = 0;
		int high = n-1;
		int max = Integer.MIN_VALUE;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(a[mid] == key) {
				max = Integer.max(max,a[mid]);
				high = mid - 1;
			}
			if(a[mid] < key) {
				low = mid + 1;
			}
			if(a[mid] > key) {
				high = mid - 1;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			int min = Integer.MAX_VALUE;
			for(int i = 1;i<n;i++) {
				min = Integer.min(min,a[i]-a[i-1]);
			}
			System.out.println(Solve(a, n, k, min,a[n-1]-a[0]));
		}
	}

}
