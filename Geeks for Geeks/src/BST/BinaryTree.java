package BST;

import javax.xml.soap.Node;

public class BinaryTree {
	
	int min  = Integer.MAX_VALUE;
	int max =  Integer.MIN_VALUE;
	
	static boolean isBst(Node root, int min, int max) {
		if(root == null)
			return true;
		if(root.data <= min || root.data >= max) {
			return false;
		}
		return (isBst(root.left,min,root.data-1)&&isBst(root.right,node.data+1,max));
	}
	
	// null<-12<-3->4->null
	//temp = null
	//next = s
	static Node Reverse(Node head) {
		if(head == null) {
			return head;
		}
		Node prev = null;
		Node curr = head;
		while(curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}