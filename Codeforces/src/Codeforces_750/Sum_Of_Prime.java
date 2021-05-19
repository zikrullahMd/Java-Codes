package Codeforces_750;
import java.util.*;
public class Sum_Of_Prime {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> list = new ArrayList();
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		for(int i = 2;i*i<=n;i++) {
			for(int j = 2*i;j<=n;j+=i) {
				isPrime[j] = false;
			}
		}
		for(int i = 2;i<n;i++) {
			if(isPrime[i] == true) {
				list.add(i);
			}
		}
		int i = 0;
		int j = list.size()-1;
		boolean ok = false;
		while(i<j) {
			if(list.get(i) + list.get(j)==n && list.contains(n)) {
				ok = true;
				break;
			}
			if(list.get(i) + list.get(j) < n) {
				i++;
			}
			if(list.get(i) + list.get(j) > n) {
				j--;
			}
		}
		System.out.println(ok);
	}

}
