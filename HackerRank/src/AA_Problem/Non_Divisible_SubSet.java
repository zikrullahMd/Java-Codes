package AA_Problem;
import java.util.*;
public class Non_Divisible_SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int[] freq = new int[k];
		for(int i = 0;i<n;i++) {
			freq[(a[i]%k)]++;
		}
		int count = 0;
		if(k % 2 == 0) {
			for(int i = 1;i<=k/2-1;i++) {
				count += Math.max(freq[i], freq[k-i]);
				//System.out.println("k"+freq[k-i]);
			}
			if(freq[k/2] != 0) {
				count++;
			}
			if(freq[0] != 0) {
				count++;
			}
		}else {
			for(int i = 1;i<=k/2;i++) {
				count += Math.max(freq[i], freq[k-i]);
			}
			if(freq[0] != 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
