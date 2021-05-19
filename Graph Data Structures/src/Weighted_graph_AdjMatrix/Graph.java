package Weighted_graph_AdjMatrix;
import java.util.*;
import java.awt.*;
public class Graph {

	private static LinkedList<Integer>[] adj;
	Graph(int v){
		adj = new LinkedList[v];
		for(int i = 0;i<v;i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public static void addEdge(int s, int d,int w) {
		adj[s].add(d, w);
		adj[d].add(s);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v = in.nextInt();
		int e = in.nextInt();
		Graph g = new Graph(v);
		
		for(int i = 0;i<e;i++) {
			int s = in.nextInt();
			int d = in.nextInt();
			int w = in.nextInt();
			addEdge(s,d,w);
		}
		StringBuffer s = new StringBuffer();
		//hello world
	}

}
