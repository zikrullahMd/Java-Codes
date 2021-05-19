package Problems;
import java.util.*;
public class Dilemma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
			}
			Set<Float> set = new HashSet<>();
			for(int i = 0;i<n-1;i++) {
				for(int j = i+1;j<n;j++) {
					float res = Math.abs(a[i]-a[j])/(float)2;
					set.add(res);
				}
			}
			//System.out.println(set);
			System.out.println(set.size());
		}
	}

}
