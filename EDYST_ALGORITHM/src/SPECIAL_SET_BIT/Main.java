package SPECIAL_SET_BIT;
import java.util.*;
class Main {
	static int check(int n) {
		int len = Integer.toBinaryString(n).length();
		int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
		int i = 0;
		int count = 0;
        if(primes.length == 0)
            return 0;
		while(primes[i] <= len) {
			if((n & (1<<(primes[i]-1))) > 0) {
				count++;
			}
            i++;
            if(i >= primes[i])
                break;
		}
		return count;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int l = in.nextInt();
			int r = in.nextInt();
			int count = 0;
			for(int i = l;i<=r;i++){
				count+= check(i);
			}
			System.out.println(count);
		}
		
	}
/*31
901

3*/
}