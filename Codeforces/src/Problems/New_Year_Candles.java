package Problems;
import java.util.*;
public class New_Year_Candles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int ans = 0;
		int ad = 0;
		while(a > 0) {
			ans += a;
			a += ad;
			ad = a % b;
			a = a / b;
		}
		System.out.println(ans);
	}

}