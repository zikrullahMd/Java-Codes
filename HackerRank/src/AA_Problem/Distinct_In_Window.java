package AA_Problem;
import java.util.*;
import java.util.Map.Entry;
public class Distinct_In_Window {
	
	//Noob Method
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int t = in.nextInt();
//		while(t-->0) {
//			int n = in.nextInt();
//			int k = in.nextInt();
//			int[] a = new int[n];
//			for(int i = 0;i<n;i++) {
//				a[i] = in.nextInt();
//			}
//			for(int i = 0;i<=n-k;i++) {
//				Set<Integer> set = new HashSet<>();
//				int temp = i;
//				for(int j = 0;j<k;j++) {
//					set.add(a[temp++]);
//				}
//				System.out.print(set.size()+" ");
//			}
//			System.out.println();
//		}
//	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
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
		
	}
}
