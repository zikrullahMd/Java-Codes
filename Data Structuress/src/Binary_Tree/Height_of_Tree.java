package Binary_Tree;

public class Height_of_Tree {
	static int lcount = 0;
	static int rcount = 0;

	static int getHeight(Node root) {
		
		if(root == null) return 0;
		// getting max height from left sub tree
		int l = getHeight(root.left);
		// getting max height from right sub tree
		int r = getHeight(root.right);
		
		if(l > r) {
			return l+1;
		}else {
			return r + 1;
		}
		
	}
	
	
	

}