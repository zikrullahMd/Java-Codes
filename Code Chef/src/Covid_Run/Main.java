package Covid_Run;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			String ans = "";
//			for(int i = 0;i<n;i+=k) {
//				if((i+x)%n == y) {
//					ans = "YES";
//					break;
//				}
//				ans = "NO";
//			}
			int i = (x+k)%n;
			if(x==y) {
				ans = "YES";
			}else {
				while(i!=x) {
					if(i==y) {
						ans = "YES";
						break;
					}
					i = (i+k)%n;
					ans = "NO";
				}
			}
			System.out.println(ans);
		}
	}

}
