package Prime_Sum;
import java.util.*;
public class Main {
	
	static boolean isPrime(int n) {
		if (n <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1;i<=n;i++) {
			if(isPrime(i) && isPrime(n-i)) {
				list.add(i);
				list.add(n-i);
				break;
			}
		}
		ArrayList<Integer> finlist = new ArrayList<>();
		for(int i= 0;i<2;i++) {
			finlist.add(list.get(i));
		}
		System.out.println(list);
	}
}


