package Binary_Tree;
import java.util.*;
public class Paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BinaryTree bt = new BinaryTree();
//		bt.root = new BNode(1);
//		bt.root.left = new BNode(2);
//		bt.root.right = new BNode(3);
//		bt.root.left.left = new BNode(4);
//		bt.root.left.left.left = new BNode(5);
//		bt.root.left.right = new BNode(6);
//		bt.root.right.right = new BNode(7);
//		bt.inorder(bt.root);
		BNode root = bt.CreateTree();
		bt.inorder(root);
		ArrayList<String> pa = bt.getPath(root);
		for(String s : pa) {
			System.out.println(s);
		}
	}

}

class BNode{
	
	Scanner in = new Scanner(System.in);
	BNode left,right;
	int val;
	public BNode(int val) {
		this.val = val;
		left = right = null;
	}
}

class BinaryTree{
	Scanner in = new Scanner(System.in);
	BNode root;
	BinaryTree(int val){
		root = new BNode(val);
	}
	BinaryTree(){
		root = null;
	}
	public BNode CreateTree() {
		BNode root = null;
		System.out.println("enter data or -1 to exit");
		int data = in.nextInt();
		if(data == -1) return null;
		root = new BNode(data);
		System.out.println("enter left child of "+root.val);
		root.left = CreateTree();
		System.out.println("enter right child "+root.val);
		root.right = CreateTree();
		return root;
	}
	public void inorder(BNode root) {
		if(root != null) {
			inorder(root.left);
			
			System.out.println(root.val);
			
			inorder(root.right);
		}
	}
	public static ArrayList<Integer> paths = new ArrayList<>();
	public ArrayList<String> getPath(BNode root){
		ArrayList<String> path = new ArrayList<>();
		if(root == null) return path;
		backtrack(root,"",path);
				
		return path;
	}
	public void backtrack(BNode root, String current,ArrayList<String> path) {
		current += " "+root.val;
		if(root.left == null && root.right == null) //some base condition
			{
			path.add(current);
			return;
		}
		if(root.left != null)
			backtrack(root.left,current,path);
		if(root.right != null)
			backtrack(root.right,current,path);
		// some decisional operation
	}
}

