package BinarySearchTree;
                                                /*
                                                 * 1
										        /    \ 
										       2      3
										      / \   /   \
										     4   5  6   7
										               /  \ 
										              8   9 */
												/*Output
												 * 
												 * 
												 * 4
												   2
												   1 5 6
												   3 8
												   7
												   9*/
import BinarySearchTree.bst.Node;
import java.util.*;


public class VerticalOrderTraversal {
	static Node root;
	static bst b = new bst();
	
	
	public static void VerticalOrder() {
		verticaOrderRec(root);
	}
	public static void verticaOrderRec(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		Map<Integer,Node> map = new HashMap<>();
		int hd = 0;
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			map.put(hd, temp);
			if(temp.left != null) {
				hd -= 1;
				map.put(hd, temp.left);
				q.add(temp.left);
			}
			if(temp.right != null) {
				hd += 1;
				map.put(hd,temp.right);
				q.add(temp.right);
			}
		}
		for(Node i : map.values()) {
			System.out.print(i.key);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0;i<n;i++) {
			int e = in.nextInt();
			b.insert(e);
		}
		VerticalOrder();
	}
}
