package Unit_and_Intersection;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = in.nextInt();
		}
		int[] f = new int[n+m];
		int k = 0;
		for(int i = 0;i<n;i++) {
			f[k++] = a[i];
		}
		for(int i = 0;i<m;i++) {
			f[k++] = b[i];
		}
		
		System.out.println("Union");
		for (int i = 0; i < f.length; i++) {
			System.out.print(f[i]+" ");
		}
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i<n;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		for(int i = 0;i<m;i++) {
			if(map.containsKey(b[i])) {
				map.put(b[i], map.get(b[i])+1);
			}else {
				map.put(b[i], 1);
			}
		}
		System.out.println();
		System.out.println("Intersection");
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}

}
