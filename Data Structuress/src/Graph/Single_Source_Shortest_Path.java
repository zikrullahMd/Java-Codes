package Graph;
import java.awt.Point;
import java.util.*;
public class Single_Source_Shortest_Path {
	
	public static ArrayList<Integer> top = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of vertices");
		int v = in.nextInt();
		wGraph g = new wGraph(v);
		System.out.println("Enter no of edges");
		int e = in.nextInt();
		System.out.println("enter s->d->weight");
		for(int i = 0;i<e;i++) {
			int s = in.nextInt();
			int d = in.nextInt();
			int w =in.nextInt();
			g.addEdge(s, d, w);
		}
		topSort(g.adj, v);
		for(int i : top) {
			System.out.print(i+" ");
		}
		System.out.println("Enter the destination node");
		int d = in.nextInt();
		System.out.println("Shortes path between start and "+d+" is:");
		Integer[] ans = SSP(g.adj,0,v);
		System.out.println(ans[d]);
	}
	
	
	public static int[] topSort(LinkedList<Point>[] adj, int v) {
		boolean[] vis = new boolean[v+1];
		Stack<Integer> st = new Stack<>();
		for(int i = 0;i<v;i++) {
			if(!vis[i]) {
				topSortUtil(i,st,vis,adj);
			}
		}
		int[] ans = new int[st.size()];
		int k = 0;
		while(!st.isEmpty()) {
			ans[k++] = st.pop();
		}
		return ans;
	}
	public static void topSortUtil(int s, Stack<Integer> st, boolean[] vis, LinkedList<Point>[] adj) {
		vis[s] = true;
		Integer v;
		Iterator<Point> it = adj[s].iterator();
		while(it.hasNext()) {
			v = it.next().x;
			if(vis[v] == false) {
				topSortUtil(v,st,vis,adj);
			}
		}
		st.push(s);
	}

	public static Integer[] SSP(LinkedList<Point>[] adj, int start, int v) {
		int[] sort = topSort(adj,v);
		Integer[] dist = new Integer[v];
		dist[0] = 0;
		for(int i = 0;i<v;i++) {
			int nodeIndex = sort[i];
			if(dist[nodeIndex] != null) {
				List<Point> anjacent = adj[nodeIndex];
				if(anjacent != null) {
					for(Point p : anjacent) {
						int newDist = dist[nodeIndex] + p.y;
						if(dist[p.x] == null) dist[p.x]= newDist;
						else dist[p.x]= Math.min(dist[p.x], newDist); 
					}
				}
			}
		}
		return dist;
	}
}


class wGraph{
	LinkedList<Point>[] adj;
	int v;
	public wGraph(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0;i<v;i++) {
			adj[i] = new LinkedList();
		}
	}
	public void addEdge(int s, int d, int w) {
		adj[s].add(new Point(d,w));
	}
}
