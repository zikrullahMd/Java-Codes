package Graph;
import java.util.*;

public class Depth_First_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of vertices :");
		int v = in.nextInt();
		GraphP g = new GraphP(v);
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
		System.out.println("Enter destination vertes : ");
		int d = in.nextInt();
		boolean[] vis = new boolean[v+1];
		vis[s] = true;
		System.out.println(g.isPath(s,d,vis));
	}

}


class GraphP{
	public LinkedList<Integer>[] adj;
	public GraphP(int v) {
		adj = new LinkedList[v+1];
		for(int i = 0;i<v+1;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int s, int d) {
		adj[s].add(d);
		adj[d].add(s);
	}
	
	public boolean isPath(int s, int d, boolean[] vis) {
		if(s == d) return true;
		for(int n : adj[s]) {
			if(!vis[n]) {
				vis[n] = true;
				boolean isConnected = isPath(n,d,vis);
				if(isConnected) return true;
			}
		}
		return false;
	}
	
}