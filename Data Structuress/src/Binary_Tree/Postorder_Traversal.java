package Binary_Tree;

public class Postorder_Traversal {

	protected void Postorder(Node root) {
		PostorderRec(root);
	}
	
	protected void PostorderRec(Node root) {
		if(root != null) {
			
			PostorderRec(root.left);
			PostorderRec(root.right);
			System.out.print(root.data+" ");
			
		}
	}
	
	
	
}
