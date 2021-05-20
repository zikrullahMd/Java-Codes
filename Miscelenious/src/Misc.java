import java.util.*;
import java.math.*;
import java.util.Map.Entry;
public class Misc
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        System.out.println(s.substring(start,end+1));
    }
    public static int expandAroundCenter(String s, int left , int right) {
    	int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}


class Node{
	LinkedList[] adj;
	int v;
	public Node(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0;i<v;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int s, int d) {
		adj[s].add(d);
	}
	
}


























