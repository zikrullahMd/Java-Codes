package Graph;

import java.util.*;

public class DFS {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of vertices :");
		int v = in.nextInt();
		GraphDepth g = new GraphDepth(v);
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
		g.dfs(s);
	}
  
}

class GraphDepth{
	LinkedList<Integer>[] adj;
	int v;
	public GraphDepth(int n) {
		adj = new LinkedList[n+1];
		for(int i = 0;i<n;i++) {
			adj[i] = new LinkedList<>();
		}
		v = n;
	}
	public  static ArrayList<Integer> list = new ArrayList<>();
	public void addEdge(int s, int d) {
		adj[s].add(d);
	}
	public void dfs(int s) {
		boolean[] vis = new boolean[v+1];
		dfsUtil(s,vis);
		for(int i : list) {
			System.out.print(i+" ");
		}
	}
	public void dfsUtil(int s, boolean[] vis) {
		if(vis[s] == true) {
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