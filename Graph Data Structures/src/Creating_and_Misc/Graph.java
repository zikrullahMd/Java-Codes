package Creating_and_Misc;
import java.util.*;
public class Graph {
	
	static private LinkedList<Integer>[] adj;
	
	public Graph(int v) {
		adj = new LinkedList[v];
		for(int i = 0;i<v;i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source, int dest) {
		adj[source].add(dest);
		adj[dest].add(source);
	}
	
	
	// BFS Implementation
	
	static int bsf(int source, int dest) {
		
		boolean[] visited = new boolean[adj.length];
		
		Queue<Integer> q = new LinkedList<>();
		int[] parent = new int[adj.length];
		q.add(source);
		parent[source] = -1;
		while(!q.isEmpty()) {
			int cur =q.poll();
			if(cur == dest) break;
			for(int neighbour : adj[cur]) {
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					parent[neighbour] = cur;
				}
			}
		}
		
		int dist = 0;
		int cur = dest;
//		for(int i= 0;i<parent.length;i++) {
//			System.out.print(parent[i]+" ");
//		}
		while(parent[cur] != -1) {
			System.out.print(cur+" --> ");
			cur = parent[cur];
			dist++;
		}
		return dist;
		
	}
	
	//Recursive DFS Implementation
	public static boolean DFSUtile(int s, int d , boolean[] visited) {
		//Base case
		if(s == d) return true;
		for(int neighbour : adj[s]) {
			if(!visited[neighbour]) {
				visited[neighbour] = true;
				boolean is_Connected = DFSUtile(neighbour,d,visited);
				if(is_Connected) return true;
			}
		}
		return false;
	}
	
	//Supporting Method
	public static boolean DFS(int s, int d) {
		boolean visited[] = new boolean[adj.length];
		return DFSUtile(s,d,visited);
	}
	
	
	
	// DFS Stack Implementation

	public static boolean DFS_Stack(int s, int d)
	{
		boolean[] visited = new boolean[adj.length];
		visited[s] = true;
		Stack<Integer> stack = new Stack<>();
		stack.push(s);
		while(!stack.isEmpty())
		{
			int cur = stack.pop();
			if(cur == d) return true;
			for(int neighbor : adj[cur])
			{
				if(!visited[neighbor])
				{
					visited[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}
		return false;
	}
	
	
	private static void printGraph(LinkedList<Integer>[] adj2) 
    { 
        for (int i = 0; i < adj2.length; i++) { 
            System.out.println("\nAdjacency list of vertex" + i); 
            System.out.print("head"); 
            for (int j = 0; j < adj2[i].size(); j++) { 
                System.out.print(" -> "+adj2[i].get(j)); 
            } 
            System.out.println(); 
        } 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of vertices");
		int v = in.nextInt();
		System.out.println("Enter no of Edges");
		int e = in.nextInt();
		Graph graph = new Graph(v);
		System.out.println("Enter "+e+" edges");
		for (int i = 0; i < e; i++){
			int source = in.nextInt();
			int dest = in.nextInt();
			graph.addEdge(source, dest);
		}
		System.out.println("Enter source");
		int source = in.nextInt();
		System.out.println("Enter Destination");
		int dest = in.nextInt();
		System.out.println("Minimum Distance is "+graph.bsf(source, dest));
		System.out.println("Possible "+DFS(source,dest));
		System.out.println("Possible in Stack "+DFS_Stack(source,dest));
		System.out.println();
		printGraph(adj);
		
	}

}
