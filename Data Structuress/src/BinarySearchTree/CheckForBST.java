package BinarySearchTree;
import BinarySearchTree.bst.Node;
public class CheckForBST {
	
	public static boolean check(Node root) {
		return yes(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	public static boolean yes(Node root,int min,int max) {
		if(root == null)
			return true;
		if(root.key < min || root.key >  max) {
			return false;
		}
		return yes(root.left,min,root.key-1) && yes(root.right,root.key+1,max);
	}
	
}