package Problems;
import java.util.*;
public class FynMan {
	static int power(int N, int P) 
    { 
        int pow = 1; 
        for (int i = 1; i <= P; i++) 
            pow *= N; 
        return pow; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		while((n = in.nextInt()) != 0) {
			int sum = 0;
			while(n != 0) {
				sum += power(n,2);
				n--;
			}
			System.out.println(sum);
		}
	}

}
