package chfnswap;
import java.util.*;
import java.math.*;
import java.io.*;
class FastReader 
{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader() 
    { 
        br = new BufferedReader(new
                 InputStreamReader(System.in)); 
    } 

    String next() 
    { 
        while (st == null || !st.hasMoreElements()) 
        { 
            try
            { 
                st = new StringTokenizer(br.readLine()); 
            } 
            catch (IOException  e) 
            { 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 

    int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 

    long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 

    double nextDouble() 
    { 
        return Double.parseDouble(next()); 
    } 

    String nextLine() 
    { 
        String str = ""; 
        try
        { 
            str = br.readLine(); 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
        return str; 
    } 
} 
public class Main {
	static FastReader in = new FastReader();
	public static long findPos(long sum) {
		long ans = (long) Math.sqrt(1+4*(sum));
		ans = (long) (ans - 1.0);
		ans = (long) (ans/2.0);
		long finalAns = ans;
		return finalAns;
	}
	public static void subMain() {
		long n = in.nextLong();
		long sum = (n)*(n+1)/2;
		if(sum % 2 != 0) {
			System.out.println(0);
			return;
		}
		long x = findPos(sum);
		long subsum = x*(x+1)/2;
		if(sum/2 == subsum){
			long result = (x*(x-1))/2 + ((n-x)*(n-x-1))/2+(n-x);
			System.out.println(result);
		}else {
			System.out.println(n-x);
		}
		
	}
public static void main(String[] args) {
	int t = 1;
	t = in.nextInt();
		while(t-->0) {
			subMain();
			System.out.println();
		}
	}
}
