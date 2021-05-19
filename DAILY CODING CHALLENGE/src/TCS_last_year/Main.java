package TCS_last_year;
import java.util.*;
public class Main {
	static ArrayList<Integer> prime = new ArrayList<>();
	static int MAX_SIZE = 100005;
	static int getFib(int n) {
		if(n <= 1)
			return n;
		return getFib(n-1) + getFib(n-2);
	}
	static void SieveOfEratosthenes()  
    {  
        // Create a boolean array "IsPrime[0..MAX_SIZE]"  
        // and initialize all entries it as true.  
        // A value in IsPrime[i] will finally be false  
        // if i is Not a IsPrime, else true.  
        boolean [] IsPrime = new boolean[MAX_SIZE];  
          
        for(int i = 0; i < MAX_SIZE; i++) 
            IsPrime[i] = true; 
          
        for (int p = 2; p * p < MAX_SIZE; p++)  
        {  
            // If IsPrime[p] is not changed,  
            // then it is a prime  
            if (IsPrime[p] == true)  
            {  
                // Update all multiples of p greater than or  
                // equal to the square of it  
                // numbers which are multiple of p and are  
                // less than p^2 are already been marked.  
                for (int i = p * p; i < MAX_SIZE; i += p)  
                    IsPrime[i] = false;  
            }
        }
        }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		if(n % 2 == 0) {
//			getPrime();
//			System.out.println(prime.get(n));
//		}else {
//			System.out.println(getFib(n));
//		}
		SieveOfEratosthenes();
		System.out.println(prime.get(n));
		
	}

}
