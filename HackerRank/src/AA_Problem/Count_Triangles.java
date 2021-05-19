package AA_Problem;
import java.util.*;
public class Count_Triangles {

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
			int count = 0;
			Arrays.sort(a);
			for(int i = a.length-1;i>=1;i--) {
				int l = 0;
				int r = i-1;
				while(l<r) {
					if(a[l] + a[r] > a[i]) {
						count += r - l;
						r--;
					}else {
						l++;
					}
				}
			}
//			METHOD 1 (NOOB METHOD)
//			for(int i = 0;i<n;i++) {
//				for(int j = i+1;j<n;j++) {
//					for(int k = j+1;k<n;k++) {
//						if(a[i] + a[j] > a[k] && a[j] + a[k] > a[i] && a[i] + a[k] > a[j]) {
//							count++;
//						}
//					}
//				}
//			}
			System.out.println(count);
		}
	}

}
