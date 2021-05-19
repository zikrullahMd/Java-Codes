package IceCream_Parlour;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int k = in.nextInt();
			int n = in.nextInt();
			int[] a = new int[n+1];
			for (int i = 1; i <=n; i++) {
				a[i] = in.nextInt();
			}
			for(int i = 1;i<=n;i++) {
				for(int j = i+1;j<=n;j++) {
					int sum = a[i] + a[j];
					if(sum == k) {
						System.out.println(i+" "+j);
						break;
					}
				}
			}
		}
	}
	//1 2 3 4 5
}
