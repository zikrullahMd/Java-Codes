package Binary_Tree;
import java.util.*;
public class Path_to_given_Node {
	public static boolean Recurs(Node root, int node, ArrayList<Integer> list) {
		if(root == null) return false;
		if(root.data == node) {
			list.add(root.data);
			return true;
		}
		boolean left = Recurs(root.left,node,list);
		boolean right = Recurs(root.right,node,list);
		if(left) {
			list.add(root.data);
			return true;
		}
		if(right) {
			list.add(root.data);
			return true;
		}
		return false;
	}
	public static ArrayList<Integer> PathToNode(Node root,int node){
		ArrayList<Integer> list = new ArrayList<>();
		if(root ==  null) return list;
		Recurs(root,node,list);
		return list;
	}
}
