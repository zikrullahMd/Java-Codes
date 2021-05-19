package Graph;

import java.util.LinkedList;
import java.util.*;
import java.util.Queue;

public class Breadth_First_search {
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter no of vertices");
		int n = in.nextInt();
		GraphD g = new GraphD(n);
		System.out.println("enter no of edges");
		int e = in.nextInt();
		System.out.println("Enter s -> d pair");
		for(int i = 0;i<e;i++) {
			int s = in.nextInt();
			int d = in.nextInt();
			g.addEdge(s, d);
		}
		System.out.println("Enter source node for BFS");
		int s = in.nextInt();
		g.BFS(s);
	}
	
}

class GraphD{
	public LinkedList<Integer>[] adj;
	public GraphD(int v) {
		adj = new LinkedList[v];
		for(int i = 0;i<v;i++) {
			adj[i] = new LinkedList();
		}
	}
	public void addEdge(int s, int d) {
		adj[s].add(d);
		adj[d].add(s);
	}
	public void BFS(int s) {
		
		boolean[] vis = new boolean[adj.length];
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		vis[s] = true;
		while(!q.isEmpty()) {
			s = q.poll();
			System.out.print(s+" ");
			//Iterator<Integer> i = adj[s].iterator();
			for(int i = 0;i<adj[s].size();i++) {
				int n = adj[s].get(i);
				if(!vis[n]) {
					vis[n] = true;
					q.add(n);
				}
			}
		
		}
	}
}
