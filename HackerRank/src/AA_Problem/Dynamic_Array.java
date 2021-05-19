package AA_Problem;
import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Dynamic_Array {
	
	static List<List<Long>> finalList = new ArrayList<>();
	static List<Long> list = new ArrayList<>();
	static long la = 0;
	static List<Long> ans = new ArrayList<>();
	public Dynamic_Array(int n) {
		for(int i = 0;i<n;i++) {
			list = new ArrayList<>();
			finalList.add(list);
		}
	}
	
	public static void Append(long x, long y , int n) {
		long row = (x ^ la) % n;
		List<Long> list = finalList.get((int) row);
		list.add(y);
	}
	
	public static void Print(long x, long y , int n) {
		long col = 0;
		long row = (x ^ la) % n;
		
		List<Long> list = finalList.get((int)row);
		col = (y % list.size());
		la = list.get((int)col);
		ans.add(la);
		System.out.println(la);
	}
	
	public static boolean Debugger(List<Long>tc,int n) {
		
		for(int i = 0;i<n;i++) {
			
			if(tc.get(i) != ans.get(i)) {
				System.out.println("need this "+tc.get(i) +" fount this "+ans.get(i));
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		
		Dynamic_Array da = new Dynamic_Array(n);
		while(q-->0) {
			long type = in.nextLong();
			long x = in.nextLong();
			long y = in.nextLong();
			
			if(type == 1) {
				
				da.Append(x,y,n);
				
			}else {
				da.Print(x,y,n);
				
			}
		}
		ArrayList<Long> tc = new ArrayList<>();
		for(int i = 0;i<=ans.size();i++) {
			int e = in.nextInt();
			tc.add((long)e);
		}
		System.out.println(Debugger(tc,n));
	}

}
