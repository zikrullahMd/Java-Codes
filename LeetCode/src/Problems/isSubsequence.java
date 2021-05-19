package Problems;

import java.util.*;
import java.util.Map.Entry;
public class isSubsequence{
	public static boolean isSubsequence(String s, String t) {
        List<Integer>[] idx = new List[256]; // Just for clarity
        for (int i = 0; i < t.length(); i++) {
            if (idx[t.charAt(i)] == null)
                idx[t.charAt(i)] = new ArrayList<>();
            idx[t.charAt(i)].add(i);
        }
        
        int prev = 0;
        for (int i = 0; i < s.length(); i++) {
            if (idx[s.charAt(i)] == null) return false; // Note: char of S does NOT exist in T causing NPE
            int j = Collections.binarySearch(idx[s.charAt(i)], prev);
            if (j < 0) j = -j - 1;
            if (j == idx[s.charAt(i)].size()) return false;
            prev = idx[s.charAt(i)].get(j) + 1;
        }
        return true;
    }
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String v = in.next();
		long t = in.nextLong();
		while(t-->0) {
			String s = in.next();
			System.out.println(isSubsequence(s,v) ? "POSITIVE" : "NEGATIVE");
		}
	}
}
