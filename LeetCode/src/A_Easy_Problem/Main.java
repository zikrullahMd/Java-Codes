package A_Easy_Problem;
import java.util.*;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node nn = new Node(2);
		nn.left = new Node(3);
		nn.left.left = new Node(3);
		nn.left.right = new Node(1);
		nn.right = new Node(1);
		nn.right.right = new Node(1);
		int count = 0;
		List<List<Integer>> paths = new ArrayList<>();
		dfs(nn,new ArrayList(),paths);
		
		for(List<Integer> path : paths) {
			if(isPalin(path)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	// Method to get path to all the nodes from root of binary tree
	public static void dfs(Node root, List<Integer> path, List<List<Integer>> paths) {
		if(root == null) {
			return;
		}
		List<Integer> Newpath = new ArrayList<>();
		Newpath.add(root.val);
		if(root.left == null && root.right == null) {
			paths.add(Newpath);
			return;
		}
		dfs(root.left,Newpath,paths);
		dfs(root.right,Newpath,paths);
		
	}
	
	public static boolean isPalin(List<Integer> path) {
		int[] freq = new int[10];
		for(int i : path) {
			freq[i]++;
		}
		return Arrays.stream(freq).filter(x -> x%2 == 1).count() <= 1;
	}

}


class Node{
	int val;
	Node left;
	Node right;
	public Node(int data) {
		val = data;
		left = right = null;
	}
}