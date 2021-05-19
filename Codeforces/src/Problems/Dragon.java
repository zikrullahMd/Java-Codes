package Problems;
import java.util.*;
public class Dragon {
	
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	
	static void MSort(int[] a) {
		int n = a.length;
		for(int i = 0;i<n-1;i+=2) {
	for(int j=i+2;j<n-1;j+=2){
				if(a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
					int k = a[i+1];
					a[i+1] = a[j+1];
					a[j+1] = k;
				}}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		TreeMap<Integer,Integer> map = new TreeMap<>();
		while(n-->0) {
			int a = in.nextInt();
			int b = in.nextInt();
			try
			{
				map.put(a,map.get(a)+b);
			}
			catch(NullPointerException e)
			{
				map.put(a,b);
			}
		}
		String ans = "YES";
		for(Integer i:map.keySet())
		{
			if(s > i ) 
				s += map.get(i);
			else
			{
				ans = "NO";
				break;
			}
			
		}
		System.out.println(ans);
	}

}
