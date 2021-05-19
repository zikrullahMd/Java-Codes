package Graph;

import java.util.LinkedList;
import java.util.Scanner;

public class Connected_components {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of vertices :");
		int v = in.nextInt();
		GraphC g = new GraphC(v);
		System.out.println("Enter no of edges :");
		int e = in.nextInt();
		System.out.println("enter s -> d pairs");
		for(int i = 0;i<e;i++) {
			int s = in.nextInt();
			int d = in.nextInt();
			g.addEdge(s, d);
		}
		System.out.println("the connected components are : ");
		g.dfs();
	}

}
class GraphC{
	int v;
	public LinkedList<Integer>[] adj;
	public GraphC(int v) {
		this.v = v;
		adj = new LinkedList[v+1];
		for(int i = 0;i<v+1;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int s, int d) {
		adj[s].add(d);
		adj[d].add(s);
	}
	
	public void dfsUtil(int s, boolean[] vis) {
		vis[s] = true;
		System.out.print(s+" ");
		for(int i : adj[s]) {
			if(!vis[i]) {
				dfsUtil(i,vis);
			}
		}
	}
	
	public void dfs() {
		boolean[] vis = new boolean[v+1];
		for(int i = 0;i<v;i++) {
			if(!vis[i]) {
				dfsUtil(i,vis);
			}
			System.out.println();
		}
	}
}