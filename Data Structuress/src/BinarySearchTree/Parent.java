package BinarySearchTree;

import BinarySearchTree.bst.Node;

public class Parent {
	public Node getParent(Node root, int num , int parent) {
		if(root == null) return root;
		if(root.key == num) {
			return root;
		}else {
			getParent(root.left,num,root.key);
			getParent(root.right,num,root.key);
		}
		return root;
	}
}
