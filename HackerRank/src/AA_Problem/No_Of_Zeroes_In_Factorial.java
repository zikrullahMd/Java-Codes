package AA_Problem;
import java.util.*;
public class No_Of_Zeroes_In_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		for(int i = 5;i<=n;i*=5) {
			count += n/i;
		}
		System.out.println(count);
	}

}
