package Binary_Tree;
import Binary_Tree.Main;
import Binary_Tree.Inorder_Traversal;
public class Mirror_of_Tree {

	static Node mirrorify(Node root) {
		if(root == null)
			return root;
		Node right = mirrorify(root.right);
		Node left = mirrorify(root.left);
		
		root.left = right;
		root.right = left;
		return root;
	}
	
	

}
