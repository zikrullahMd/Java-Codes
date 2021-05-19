package BinarySearchTree;
import java.util.*;
import BinarySearchTree.bst.Node;
public class Sum_In_Range {
	
	protected static int SubBST(Node root, int low, int high) {
		int sum = 0;
		if(root == null)
			return sum;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			if(cur.key >= low && cur.key <= high) {
				sum += cur.key;
			}
			// checking condition in left sub tree
			if(cur.left != null && cur.key > low) {
				q.add(cur.left);
			}
			// checking condition in right sub tree
			if(cur.right != null && cur.key < high) {
				q.add(cur.right);
			}
		}
		return sum;
	}
	
	
}
