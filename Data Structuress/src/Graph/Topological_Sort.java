package Graph;
import java.util.*;
public class Topological_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of Vertices");
		int v = in.nextInt();
		DAG g = new DAG(v);
		System.out.println("Enter number of edges");
		int e = in.nextInt();
		System.out.println("Enter v-e pairs");
		for(int i = 0;i<e;i++) {
			int s = in.nextInt();
			int d = in.nextInt();
			g.addEdge(s, d);
		}
		int[] sort = g.topoSort();
		for(int i : sort) {
			System.out.print(i+" ");
		}
	}

}


class DAG{
	LinkedList<Integer>[] adj;
	int v;
	public DAG(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0;i<v;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int s, int d) {
		adj[s].add(d);
	}
	
	public void topoSortUtil(int i , boolean[] vis, Stack<Integer>st) {
		vis[i] = true;
		Integer v;
		
		Iterator<Integer> it = adj[i].iterator();
		while(it.hasNext()) {
			v = it.next();
			if(vis[v] == false) {
				topoSortUtil(v,vis,st);
			}
		}
		st.push(new Integer(i));
	}
	
	public int[] topoSort() {
		boolean[] vis = new boolean[v];
		Stack<Integer> st = new Stack<>();
		for(int i = 0;i<v;i++) {
			if(!vis[i]) {
				topoSortUtil(i,vis,st);
			}
		}
		int[] ans = new int[st.size()];
		int k = 0;
		while(!st.isEmpty()) {
			ans[k++] = st.pop();
		}
		return ans;
	}
	
}