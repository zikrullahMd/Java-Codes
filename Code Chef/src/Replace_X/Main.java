package Replace_X;
import java.util.*;
import java.lang.Math;
import java.util.stream.IntStream;
public class Main {
	//to check if x is present in array
	static boolean check(int[] a, int e) {
		return Arrays.binarySearch(a, e) > 0 ? true : false;
	}
	
	static int getOps(int[] a, int pr, int k , int p) {
		int op = 0;
		if(a[p] == a[pr]) {
			return op;
		}
		else if(k>=p && a[p] >= a[pr]) {
			op = p - pr;
			return op;
		}
		else if(k<=p && a[p] <=a[pr]) {
			op = pr-p;
			return op;
		}
		return Integer.MAX_VALUE;
		
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int x = in.nextInt();
			int p = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n+1];
			for (int i = 1; i <=n; i++) {
				a[i] = in.nextInt();
			}
			int op = 0;
			Arrays.sort(a);
			if(!check(a,x)) {
				a[k] = x;
				op++;
			}
			
			Arrays.sort(a);
			int mini = Integer.MAX_VALUE;
			for(int pr= 1;pr<=n;pr++)
			{
			    if(a[pr] == x)
			    {
        			int temp= getOps(a,pr,k,p);
        			mini = Math.min(mini, temp);
			    }
			}
			if(mini == Integer.MAX_VALUE)
			    mini = -1;
else
       			mini += op;
			System.out.println(mini);
				
		}
	}

}