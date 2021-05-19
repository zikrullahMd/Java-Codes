package BinarySearchTree;
import BinarySearchTree.bst.Node;
import java.util.*;
public class LevelOrderTraversal {
	static Node root;
	
	static void levelOrder() {
		levelOrderRec(root);
	}
	static void levelOrderRec(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			System.out.print(temp.key+" ");
			if(temp.left != null) {
				q.add(temp.left);
			}
			if(temp.right != null) {
				q.add(temp.right);
			}
		}
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		bst b = new bst();
		int n = in.nextInt();
		for(int i = 0;i<n;i++) {
			int e = in.nextInt();
			b.insert(e);
		}
		levelOrder();
	}

}
