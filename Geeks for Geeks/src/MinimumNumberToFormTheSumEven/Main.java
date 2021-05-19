/*Given an array arr[] of size N, the task is to add the minimum number
 * (should be greater than 0) to the array so that the sum of the array 
 * becomes even
 */


package MinimumNumberToFormTheSumEven;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] a = new long[(int) n];
		for(int i = 0;i<n;i++)
			a[i] = in.nextInt();
		System.out.println(minNum(a,n));
	}
	
	static long minNum(long a[], int n)
    {
        // Your code goes here
        long inSum = 0;
        long ans = 0;
        for(int i = 0;i<n;i++)
            inSum += a[i];
        if(inSum % 2 == 0){
            ans = 2;
        }else{
            long reqSum = inSum + 1;
            ans = reqSum - inSum;
        }
        return ans;
    
    }

}
