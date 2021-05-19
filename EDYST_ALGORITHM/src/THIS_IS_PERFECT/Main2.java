package THIS_IS_PERFECT;

import java.util.*;
class Main2 {
	// CORRECT
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			long n = in.nextLong();
			long sum = 1;
            for(int i = 2 ; i*i <=n;i++) {
            	if(n % i == 0) {
            		if(i * i != n) {
            			sum += i + n/i;
            		}else {
            			sum += i;
            		}
            	}
            }
            if(sum == n && n != 1) {
            	System.out.println("YES");
            }else {
            	System.out.println("NO");
            }
			
		}
	}

}
