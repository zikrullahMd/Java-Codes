package A_Easy_Problem;
import java.util.*;
public class Largest_rectangleIn_Histogram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		if(a.length == 0) {
			System.out.println(0);
			return;
		}
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0;i<n;i++) {
			int k = 1;
			for(int j = i+1;j<n && a[i] <= a[j];j++) {
				k++;
			}
			q.add(a[i]*k);
		}
		if(q.isEmpty()) {
			System.out.println(0);
			return;
		}
		//System.out.println(q);
		System.out.println(q.poll());
	}

}
