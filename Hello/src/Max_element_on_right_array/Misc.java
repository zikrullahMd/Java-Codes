package Max_element_on_right_array;

import java.util.*;
import java.math.*;
import java.util.Map.Entry;
class Misc{
	
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++) {
        	a[i] = in.nextInt();
        }
        int[] ans = new int[n];
        int f = n-1;
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--) {
        	while(!st.isEmpty() && st.peek() >= a[i]) {
        		st.pop();
        	}
        	if(st.isEmpty()) {
        		ans[f--] = -1;
        		//System.out.print(-1+" ");
        	}else {
        		ans[f--] = st.peek();
        		//System.out.print(st.peek()+" ");
        	}
        	st.push(a[i]);
        }
       
        for(int k : ans) {
        	System.out.print(k+" ");
        }
    }
}