package BinarySearchTree;
import java.util.*;
import BinarySearchTree.DeleteNode;
public class bst {
	
	public class Node{
		int key;
		Node left;
		Node right;
		public Node(int item) {
			this.key = item;
			left = right = null;
		}
	}
	//array to store element inorderly
	static ArrayList<Integer> a = new ArrayList<>();
	//creating root node
	public static Node root;
	//creating bst constructor
	bst(){
		root = null;
	}
	//insert element in binary search tree
	public void insert(int item) {
		root = insertRec(root,item);
	}
	public Node insertRec(Node root, int item) {
		if(root == null) {
			root = new Node(item);
			return root;
		}
		if(item < root.key) {
			root.left = insertRec(root.left,item);
		}else {
			root.right = insertRec(root.right,item);
		}
		return root;
	}
	//Preorder Traversal
	public void preorder() {
		preorderRec(root);
	}
	public void preorderRec(Node root) {
		if(root != null) {
			System.out.print(root.key+" ");
			preorderRec(root.left);
			preorderRec(root.right);
		}
	}
	//Inorder Traversal
	public void inorder() {
		inorderRec(root);
	}
	public void inorderRec(Node root) {
		if(root != null) {
			inorderRec(root.left);
			System.out.print(root.key+" ");
			a.add(root.key);
			inorderRec(root.right);
		}
	}
	//Postorder Traversal
	public void Postorder() {
		postorderRec(root);
	}
	public void postorderRec(Node root) {
		if(root!=null) {
			postorderRec(root.right);
			postorderRec(root.left);
			System.out.print(root.key+" ");
		}
	}
	
	//Level Order Traversal
	void levelOrder() {
		levelOrderRec(root);
	}
	void levelOrderRec(Node root) {
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
	//searching in binary search tree
	static boolean search(int key) {
		if(searchRec(root,key))
			return true;
		else
			return false;
	}
	static boolean searchRec(Node root, int k) {
		if(root == null)
			return false;
		if(root.key == k)
			return true;
		if(k < root.key) {
			return searchRec(root.left,k);
		}
		else {
			return searchRec(root.right,k);
		}
	}
	//Finding minimum element
	public int getMinimum() {
		Node curr = root;
		while(curr.left != null) {
			curr = curr.left;
		}
		return curr.key;
	}
	//Finding maximum element
	public int getMax() {
		Node curr = root;
		while(curr.right != null) {
			curr = curr.right;
		}
		return curr.key;
	}
	
//	public static void Replace(Node root, int n) {
//		
//		for(int i : a) {
//			System.out.print(i+" ");
//		}
//		
//		
//	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		bst b = new bst();
		int n = in.nextInt();
		for(int i = 0;i<n;i++) {
			int k = in.nextInt();
			b.insert(k);
		}
//		b.preorder();
//		System.out.println();
//		b.inorder();
//		System.out.println();
//		b.Postorder();
//		System.out.println();
//		b.levelOrder();
//		
//		System.out.println("minimum element"+b.getMinimum());
//		System.out.println("maximum element"+b.getMax());
//		
//		System.out.println("Click 1 to search or 0 to abort");
//		int ch = in.nextInt();
//		if(ch > 0) {
//			System.out.println("enter key");
//			int key = in.nextInt();
//			if(search(key))
//				System.out.println("present");
//			else
//				System.out.println("Not found");
//		}else {
//			System.out.println("teminated!");
//			return;
//		}
//		LowestCommonAncestor lca = new LowestCommonAncestor();
//		System.out.println("Finding Lowest Common Ancestor of two nodes");
//		System.out.println("enter node 1");
//		int v1 = in.nextInt();
//		System.out.println("enter node 2");
//		int v2 = in.nextInt();
//		System.out.println("common ancestors are "+LowestCommonAncestor.lowestCommonAncestor(root, v1, v2).key);
//		
//		//Deleting Node from BST
//		System.out.println("Enter node to delete");
//		int node = in.nextInt();
//		DeleteNode.DeleteNodeBST(root,node);
//		b.inorder();
//		System.out.println("check for bst");
//		System.out.println(CheckForBST.check(root));
//		//method call
		Parent p = new Parent();
		int parent = p.getParent(root, 3, -1).key;
		System.out.println(parent);
	}

}
