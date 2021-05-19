package Sum_of_Dependencies_In_graph;
import java.util.*;
public class Main {
	static void printGraph(LinkedList<Integer>[] adj2) 
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
	static private LinkedList<Integer>[] adj;
	
	static void addEdge(int s, int d) {
		adj[s].add(d);
		adj[d].add(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int v = in.nextInt();
			int e = in.nextInt();
			adj = new LinkedList[v];
			for(int i = 0;i<v;i++)
				adj[i] = new LinkedList<>();
			for(int i = 0;i<e;i++) {
				int s = in.nextInt();
				int d = in.nextInt();
				addEdge(s,d);
			}
			int sum = 0;
			for(int i = 0;i<v;i++) {
				sum += adj[i].size();
			}
			System.out.println(sum/2);
		}
	}

}
