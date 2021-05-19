package A_Problems;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;
public class Absolute_Element_SUm {
	
	static class FastReader 
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader fr = new FastReader();
		long n = fr.nextLong();
		long[] a= new long[(int)n];
		for(long i = 0;i<n;i++) {
			a[(int)i] = fr.nextLong();
		}
		long t = fr.nextLong();
		while(t-->0) {
			long k = fr.nextLong();
			for(long i = 0;i<n;i++) {
				a[(int)i] = a[(int)i] + k;
			}
			long sum = 0;
			for(long i = 0;i<n;i++) {
				sum += Math.abs(a[(int)i]);
			}
			System.out.println(sum);
				
		}
		
	}

}
