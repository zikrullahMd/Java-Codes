package Codevita_round2;
import java.util.*;
import java.util.ArrayList;
class Graph
{
	static Scanner in = new Scanner(System.in);
	static int n = in.nextInt();
	static int[] a  = new int[n+1];
	int V;
	ArrayList<ArrayList<Integer> > adjListArray;

	Graph(int V)
	{
		this.V = V;
		adjListArray = new ArrayList<>();

		for (int i = 0; i < V; i++) {
			adjListArray.add(i, new ArrayList<>());
		}
	}

	void addEdge(int src, int dest)
	{
		adjListArray.get(src).add(dest);

		adjListArray.get(dest).add(src);
	}
	static ArrayList<Integer> list = new ArrayList<>();
	void DFSUtil(int v, boolean[] visited)
	{
		visited[v] = true;
		System.out.print(v + " ");
		for (int x : adjListArray.get(v)) {
			if (!visited[x]) {
				DFSUtil(x, visited);
				list.add(v);
			}
		}
		
	}
	static ArrayList<ArrayList<Integer>> plist = new ArrayList<>();
	void connectedComponents(int[] a)
	{
		boolean[] visited = new boolean[V];
		
		for (int v = 0; v < V; ++v) {
			if (!visited[v]) {
				DFSUtil(v, visited);
				
				System.out.println();
			}
		}
		plist.add(list);
	}

	public static void main(String[] args)
	{
		
		for(int i = 1;i<=n;i++) {
			a[i] = in.nextInt();
		}
		int p = in.nextInt();
		Graph g = new Graph(
			n+1);
		for(int i = 0;i<p;i++) {
			int s = in.nextInt();
			int e = in.nextInt();
			g.addEdge(s,e);
		}
		g.connectedComponents(a);
		for(ArrayList<Integer> li : plist) {
			System.out.println(li);
		}
	}
}
