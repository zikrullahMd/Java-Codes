package Problems;
import java.util.*;
public class Go_Goa_Gone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n = 8;
		int[] a = new int[n+1];
		for(int i = 1;i<=n;i++) {
			a[i] = in.nextInt();
		}
		int sum = 0;
		int k = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> vis = new ArrayList<>();
		ArrayList<Integer> selected = new ArrayList<>();
		while(k-->0) {
			int x = in.nextInt();
			int y = in.nextInt();
			if(vis.contains(x)) {
				if(x == Math.max(a[vis.indexOf(x)], a[vis.indexOf(x)+1])) {
					
				}
			}else if(vis.contains(y)) {
				
			}else {
				list.add(Math.max(a[x], a[y]));
			}
			vis.add(x);
			vis.add(y);
		}
		for(int i : list) {
			sum += i;
		}
		for(int i = 1;i<=n;i++) {
			if(!vis.contains(i)) {
				sum += a[i];
			}
		}
		System.out.println(list);
		System.out.println(vis);
		System.out.println(sum);
	}

}