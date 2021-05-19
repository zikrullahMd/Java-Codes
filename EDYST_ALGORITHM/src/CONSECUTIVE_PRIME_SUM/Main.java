package CONSECUTIVE_PRIME_SUM;
import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			if(n <= 2) {
				System.out.println(0);
				continue;
			}
			ArrayList<Integer> list = new ArrayList<>();
			boolean prime[] = new boolean[n+1]; 
	        for(int i=0;i<n;i++) 
	            prime[i] = true; 
	          
	        for(int p = 2; p*p <=n; p++) 
	        { 
	            // If prime[p] is not changed, then it is a prime 
	            if(prime[p] == true) 
	            { 
	                // Update all multiples of p 
	                for(int i = p*p; i <= n; i += p) 
	                    prime[i] = false; 
	            } 
	        } 
	          
	        // Print all prime numbers 
	        for(int i = 2; i <= n; i++) 
	        { 
	            if(prime[i] == true) 
	                list.add(i);
	        } 
	        int count = 0;
			for(int i = 0;i<list.size();i++) {
				int sum = 0;
				for(int j = 0;j<list.size()-1;j++) {
					sum += list.get(j);
		            if(sum == list.get(i)){
		                count++;
		            }else if(sum > list.get(i)){
		                continue;
		            }
					
				}
			}
			System.out.println(count-1);
		}
	}

}
