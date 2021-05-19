package BinarySearchTree;
import BinarySearchTree.bst.Node;
public class DeleteNode {
	public static void DeleteNodeBST(Node root,int key) {
		root = DeleteRec(root,key);
	}
	public static Node DeleteRec(Node root, int item) {
		if(root == null)
			return null;
		if(item < root.key) {
			return DeleteRec(root.left,item);
		}
		else if (item > root.key) {
			return DeleteRec(root.right,item);
		}
		else{
			return root = null;
		}
	}
}
