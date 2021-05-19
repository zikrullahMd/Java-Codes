package Graph;
import java.util.*;
public class Cycle_Detection {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of vertices :");
		int v = in.nextInt();
		GraphCycle g = new GraphCycle(v);
		System.out.println("Enter no of edges :");
		int e = in.nextInt();
		System.out.println("enter s -> d pairs");
		for(int i = 0;i<e;i++) {
			int s = in.nextInt();
			int d = in.nextInt();
			g.addEdge(s, d);
		}
		System.out.println("Enter source vertex ");
		int s = in.nextInt();
		int ans = g.cycle(v);
	}
}

class GraphCycle{
	LinkedList<Integer>[] adj;
	int v;
	public GraphCycle(int n) {
		adj = new LinkedList[n+1];
		for(int i = 0;i<n;i++) {
			adj[i] = new LinkedList<>();
		}
		v = n;
	}
	static int ans = 0;
	public  static ArrayList<Integer> list = new ArrayList<>();
	public void addEdge(int s, int d) {
		adj[s].add(d);
	}
	public int cycle(int s) {
		boolean[] vis = new boolean[v+1];
		dfsUtil(s,vis);
		for(int i : list) {
			System.out.print(i+" ");
		}
		return ans;
	}
	public void dfsUtil(int s, boolean[] vis) {
		if(vis[s] == true) {
			ans = 1;
			return;
		}
		vis[s] = true;
		list.add(s);
		for(int n : adj[s]) {
			if(!vis[n]) {
				dfsUtil(n,vis);
			}
		}
	}
}