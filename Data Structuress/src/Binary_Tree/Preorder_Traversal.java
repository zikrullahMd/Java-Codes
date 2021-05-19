package Binary_Tree;

public class Preorder_Traversal {

	protected void PreOrder(Node root) {
		PreOrderRec(root);
	}
	
	protected void PreOrderRec(Node root) {
		if(root != null) {
			System.out.print(root.data+" ");
			PreOrderRec(root.left);
			PreOrderRec(root.right);
		}
	}
	
	
}
