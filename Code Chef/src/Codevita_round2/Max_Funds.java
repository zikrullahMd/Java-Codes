package Codevita_round2;
import java.util.*;
public class Max_Funds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n+1];
		for(int i = 1;i<=n;i++) {
			a[i] = in.nextInt();
		}
		int p = in.nextInt();
		Pairs[] pairs = new Pairs[p];
		int k = 0;
		while(p-->0) {
			int x = in.nextInt();
			int y = in.nextInt();
			Pairs pair = new Pairs(x,y);
			pairs[k++] = pair;
		}
		boolean[] vis = new boolean[pairs.length];
		Arrays.fill(vis, false);
		int max = 0;
		for(int i = 0;i<pairs.length;i++) {
			Set<Integer> set = new HashSet<>();
			if(vis[i] == false) {
				vis[i] = true;
				set.add(pairs[i].x);
				set.add(pairs[i].y);
				for(int j = i+1;j<pairs.length;j++) {
					if(vis[j] == false && set.contains(pairs[j].x) || set.contains(pairs[j].y)){
						set.add(pairs[j].x);
						set.add(pairs[j].y);
					}
				}
				int sum = 0;
				//System.out.println(set);
				for(int item : set) {
					sum += a[item];
				}
				max = Integer.max(max, sum);
			}
			
		}
		System.out.println(max);
	}

}
/*
 * 5
23 43 123 54 2
3
1 3
2 3
1 2*/

class Pairs{
	int x = 0;
	int y = 0;
	public Pairs(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
