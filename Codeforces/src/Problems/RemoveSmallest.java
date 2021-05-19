package Problems;
import java.util.*;
public class RemoveSmallest {

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
			ArrayList<Integer> list = new ArrayList<>();
			Arrays.sort(a);
			list.add(0);
			for(int i = 1;i<n;i++) {
				list.add(a[i]-a[i-1]);
			}
			String ans = "YES";
			for(int i : list) {
				if(i > 1) {
					ans = "NO";
					break;
				}
			}
			System.out.println(ans);
		}
	}

}
