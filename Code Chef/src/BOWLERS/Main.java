package BOWLERS;
import java.util.*;
import java.math.*;
public class Main {
		//CORRECT
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int l = in.nextInt();
			if(n > k*l) {
				System.out.println(-1);
			}else if(k==1 && n > 1) {
				System.out.println(-1);
			}else {
				int temp = 0;
				for(int i = 0;i<n;i++) {
					if(temp == k) temp = 0;
					System.out.print(++temp+" ");
				}
				
			}
		}
	}

}
