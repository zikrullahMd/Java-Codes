package AA_Problem;
import java.util.*;
public class Reverse_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			long n = in.nextLong();
			long ans  = (long) (Math.pow(2, 32) -1 - n);
			for(int i = 0;i<32;i++) {
				n = n ^ (1<<i);
			}
			System.out.println(ans);
		}
	}

}
