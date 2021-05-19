package Graph;
import java.util.*;
public class Graph {
	
	static LinkedList<Integer>[] adj;
	
	public Graph(int v) {
		adj = new LinkedList[v];
		for(int i = 0;i<v;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
}
