package BinarySearchTree;
import BinarySearchTree.bst.Node;
public class LowestCommonAncestor {
	static Node root;
	static public Node lowestCommonAncestor(Node root, int v1, int v2) {
		if(v1 < root.key && v2 < root.key) {
			return lowestCommonAncestor(root.left,v1,v2);
		}else if(v1 > root.key && v2 > root.key) {
			return lowestCommonAncestor(root.right,v1,v2);
		}else {
			return root;
		}
	}
}
