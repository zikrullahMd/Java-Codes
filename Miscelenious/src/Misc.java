import java.util.*;
import java.math.*;
import java.util.Map.Entry;
public class Misc
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ListNode l = new ListNode(0);
        ListNode curr = l;
        for(int i = 0;i<n;i++) {
        	curr.next = new ListNode(in.nextInt());
        	curr = curr.next;
        	System.out.println("for");
        }
        Solution s = new Solution();
        ListNode ans = s.solve(l.next);
        ListNode head = ans;
        while(ans != null) {
        	System.out.print(ans.val+" ");
        	ans = ans.next;
        }
        
}
}
class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}
 
class Solution {
    public ListNode solve(ListNode root) {
        if(root == null) return root;
        int n = 0;
        ListNode curr = root;
        while(curr != null){
            n++;
            curr = curr.next;
        }
        if(n <= 3){
            return root;
        }
        curr = root;
        int temp = 1;
        Stack<ListNode> st = new Stack<>();
        Queue<ListNode> q = new LinkedList<>();
        while(curr != null){
            if(temp % 2 == 0){
                st.push(curr);
            }else{
                q.add(curr);
            }
            temp++;
            curr = curr.next;
        }
        temp = 1;
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        while(!st.isEmpty() || !q.isEmpty()){
            if(temp % 2 != 0 && !q.isEmpty()){
                head.next = q.poll();
                head = head.next;
            }else if(temp % 2 == 0 && !st.isEmpty()){
                head.next = st.pop();
                head = head.next;
            }
            temp++;
        }
        return ans.next;
    }

}


















