package Count_Pair_With_SumK;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int count = 0;
		int i = 0;
		int j = n-1;
		
		while(i<j) {
			int sum = a[i] + a[j];
			if(sum < k)
				i++;
			else if(sum > k)
				j--;
			else {
				int x = a[i], xx = i; 
	            while ((i < j ) && (a[i] == x)) 
	                i++; 
	  
	            // Find the frequency of arr[j] 
	            int y = a[j], yy = j; 
	            while ((j >= i )&& (a[j] == y)) 
	                j--; 
	  
	            // If arr[i] and arr[j] are same 
	            // then remove the extra number counted 
	            if (x == y)  
	            { 
	                int temp = i - xx + yy - j - 1; 
	                count += (temp * (temp + 1)) / 2; 
	            } 
	            else
	                count += (i - xx) * (yy - j); 
			}
		}
		
		System.out.println(count);
	}

}
