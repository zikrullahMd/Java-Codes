package Problems;
import java.util.*;
import java.util.Arrays;

public class Candy_1_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int box;
		while((box = in.nextInt()) != -1) {
			Integer[] a = new Integer[box];
			int t_c = 0;
			for(int i = 0;i<box;i++) {
				a[i] = in.nextInt();
				t_c += a[i];
			}
			if(t_c % box == 0) {
				int avg = t_c / box;
				int ans = 0;
				for(int i = 0;i<box;i++) {
					if(a[i] > avg) {
						ans += a[i] - avg;
					}
				}
				System.out.println(ans);
			}else {
				System.out.println(-1);
			}
	}

}
}
