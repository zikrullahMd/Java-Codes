package Valid_BST_from_Preorder;
import java.util.*;
public class Main {
	
	static boolean Solve(int[] a) {
		int n = a.length;
		Stack<Integer> st = new Stack();
		int root = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
            if (a[i] < root) {
                return false;
            }
            while (!st.empty() && st.peek() < a[i]) {
                root = st.peek();
                st.pop();
            }
  
            st.push(a[i]);
        }
		return true;
	}
	static boolean Solve1(ArrayList<Integer> a) {
		int n = a.size();
		Stack<Integer> st = new Stack();
		int root = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
            if (a.get(i) < root) {
                return false;
            }
            while (!st.empty() && st.peek() < a.get(i)) {
                root = st.peek();
                st.pop();
            }
  
            st.push(a.get(i));
        }
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		Set<Integer> set = new HashSet(Arrays.asList(a));
		ArrayList<Integer> list = new ArrayList();
		list.addAll(set);
		System.out.println(Solve(a));
	}

}
