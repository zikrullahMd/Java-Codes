package Connect_Woods;
import java.util.*;
public class Main {
			//  NAIVE APPROACH
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n*2];
		int[] b = new int[m];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for(int i = 0;i<m;i++) {
			b[i] = in.nextInt();
		}
		boolean[] check = new boolean[m];
		String t = "";
		for(int i = 0;i<a.length;i+=2) {
			for(int j = 0;j<b.length;j++) {
				if(check[j] == false) {
					if(a[i] < b[i] && a[i+1] > b[i]) {
						t = "YES";
						check[j] = true;
					}else {
						t = "NO";
						break;
					}
				}
			}
		}
		System.out.println(t);
	}

}
