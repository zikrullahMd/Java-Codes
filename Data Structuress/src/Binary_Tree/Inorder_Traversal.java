package Binary_Tree;
import java.util.*;
public class Inorder_Traversal {
	
	protected void Inorder(Node root) {
		InorderRec(root);
	}
	
	protected void InorderRec(Node root) {
		if(root != null) {
			InorderRec(root.left);
			System.out.print(root.data+" ");
			InorderRec(root.right);
		}
	}
	
	protected void inorderIterative(Node root) {
		if(root != null) {
			
			Stack<Node> st = new Stack<>();
			st.push(root);
			while(!st.isEmpty()) {
				
				Node t = st.pop();
				System.out.print(t.data+" ");
				if(t.left != null) {
					st.add(t.left);
				}
				if(t.right != null) {
					st.add(t.right);
				}
			}
			
			
		}
	}

}
