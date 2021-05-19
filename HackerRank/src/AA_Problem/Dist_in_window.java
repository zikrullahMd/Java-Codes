package AA_Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
	
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
    


public class Dist_in_window {
	
	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(is);
		int t = Integer.parseInt(in.readLine());
		while(t-->0) {
			int n = Integer.parseInt(in.readLine());
			int k =Integer.parseInt(in.readLine());
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = Integer.parseInt(in.readLine());
			}
			HashMap<Integer,Integer> map = new HashMap<>();
			for(int i = 0;i<k;i++) {
				map.put(a[i], map.getOrDefault(a[i], 0)+1);
			}
			System.out.print(map.size()+" ");
			
			for(int i = k;i<n;i++) {
				if(map.get(a[i-k]) == 1) {
					map.remove(a[i-k]);
				}else {
					map.put(a[i-k], map.get(a[i-k])-1);
				}
				map.put(a[i], map.getOrDefault(a[i], 0)+1);
				System.out.print(map.size()+" ");
			}
			System.out.println();
		}
		int k = Integer.parseInt(in.readLine());
		
	}
}

