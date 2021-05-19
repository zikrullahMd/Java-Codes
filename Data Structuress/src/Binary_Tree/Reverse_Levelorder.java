package Binary_Tree;

import java.util.*;

public class Reverse_Levelorder {
		protected void R_Levelorder(Node root) {
			Queue<Node> q = new LinkedList<>();
			Stack<Node> s = new Stack<>();
			q.add(root);
			while(!q.isEmpty()) {
				root = q.poll();
				s.add(root);
				if(root.right != null) {
					q.add(root.right);
				}
				if(root.left != null) {
					q.add(root.left);
				}
				
			}
			
			while(!s.isEmpty()) {
				System.out.print(s.pop().data+" ");
			}
		}
}
