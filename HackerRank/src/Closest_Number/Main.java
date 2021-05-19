package Closest_Number;
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
		int min = Integer.MAX_VALUE;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i<n-1;i++) {
			int d = a[i+1] - a[i];
			min = Math.min(min, d);
		}
		for(int i = 0;i<n-1;i++) {
			int d = a[i+1] - a[i];
			if(min == d) {
				list.add(a[i+1]);
				list.add(a[i]);
			}
		}
		Collections.sort(list);
		for(int i : list) {
			System.out.print(i+" ");
		}
	}

}
