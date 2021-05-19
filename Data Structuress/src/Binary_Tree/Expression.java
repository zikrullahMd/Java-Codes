package Binary_Tree;
import java.util.*;
public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GfG g = new GfG();
		Tree node = new Tree("-");
		node.left = new Tree("4");
		node.right = new Tree("7");
//		node.left.left = new Tree("5");
//		node.left.right = new Tree("4");
//		node.right.left = new Tree("100");
//		node.right.right = new Tree("20");
		System.out.println(g.evalTree(node));
		
	}

}



class Tree{
	String data;
	Tree left;
	Tree right;
	public Tree(String data) {
		this.data = data;
	}
}
class GfG {
    public int evalTree(Tree root) {
        // Your code here.
        if(root == null){
            return 0;
        }
        // if(root.data != '+' && root.data != '-' && root.data != '*' || root.data == '/'){
        //     return Integer.parseInt(root.data);
        // }
        if(root.left == null && root.right == null){
            return Integer.parseInt(root.data);
        }
        
        int l = evalTree(root.left);
        int r = evalTree(root.right);
        
        if(root.data == "+"){
            return l + r;
        }
        if(root.data == "-"){
            return l - r;
        }
        if(root.data == "*"){
            return l * r;
        }
        
        return l / r;
        
        
        
    }
}
