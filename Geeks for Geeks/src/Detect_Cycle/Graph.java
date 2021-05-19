package Detect_Cycle;
import java.util.*;
public class Graph {
	static Scanner in = new Scanner(System.in);
	
	private LinkedList<Integer>[] adj;
	
	public Graph(int v) {
		adj = new LinkedList[v];
		for(int i = 0;i<v;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int s, int d) {
		adj[d].add(s);
	}
	
	
	//method to detect cycle in directed graph
	public boolean isCycle(int v) {
		int s = 0;
		int d = v-1;
		boolean[] visited = new boolean[adj.length];
		visited[s] = true;
		Stack<Integer> stack = new Stack<>();
		stack.push(s);
		while(!stack.isEmpty()) {
			int cur = stack.pop();
			ArrayList<Integer> list = new ArrayList<>();
			list.add(cur);
			if(cur == d)
				return false;
			for(int n : adj[cur]) {
				if(!visited[cur]) {
					visited[cur] = true;
				}
			}
		}
		
		
		return false;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = in.nextInt();
		int e = in.nextInt();
		Graph graph = new Graph(v);
		for(int i = 0;i<e;i++) {
			int s = in.nextInt();
			int d = in.nextInt();
			graph.addEdge(s, e);
		}
		
		
	}

}
