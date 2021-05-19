package Binary_Tree;
import java.util.*;
public class Main {
	static Node root = null;
	static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		Node root = creatTree();
		Inorder_Traversal ino = new Inorder_Traversal();
		Preorder_Traversal pre = new Preorder_Traversal();
		Postorder_Traversal post = new Postorder_Traversal();
		Level_Order_Traversal level = new Level_Order_Traversal();
		Height_of_Tree hot = new Height_of_Tree();
		System.out.println("Inorder Traversal Recursive");
		ino.Inorder(root);
		System.out.println("Inorder Traversal Iterative");
		ino.inorderIterative(root);
		System.out.println("Preorder Traversal");
		pre.PreOrder(root);
		System.out.println("Postorder Traversal");
		post.Postorder(root);
		System.out.println();
		System.out.println("Levelorder Traversal");
		level.Leveorder(root);
		System.out.println();
		System.out.println("Reverse Level order");
		Reverse_Levelorder r = new Reverse_Levelorder();
		r.R_Levelorder(root);
		System.out.println();
		System.out.println("HOT");
		int n = hot.getHeight(root);
		System.out.println(n);
		System.out.println();
		System.out.println();
		Mirror_of_Tree m = new Mirror_of_Tree();
		ino.Inorder(m.mirrorify(root));
	}
	
	static void printTree(Node root) {
		if(root != null) {
			System.out.print(root.data+" ");
			printTree(root.left);
			printTree(root.right);
		}
	}
	
	static Node creatTree() {
		
		Node root = null;
		
		System.out.println("Enter data :");
		int data = in.nextInt();
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left child of "+data);
		root.left = creatTree();
		
		System.out.println("Enter right child of "+data);
		root.right = creatTree();
		
		return root;
	}
	

}

class Node{
	Node left,right;
	int data;
	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}
