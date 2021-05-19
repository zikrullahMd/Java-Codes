package merge_overlapping_intervals_Array;

import java.util.*;
import java.math.*;
import java.util.Map.Entry;
class Main{
	
	
	public static int[][] merge(int[][] a){
		if(a.length == 0) {
			return new int[][] {};
		}
		List<int[]> ans = new ArrayList<>();
		Arrays.sort(a, (ar,br)-> Integer.compare(ar[0], br[0]));
		int[] currInterval = a[0];
		ans.add(currInterval);
		
		for(int[] interval : a) {
			int curr_beg = currInterval[0];
			int curr_end = currInterval[1];
			int nxt_beg = interval[0];
			int nxt_end = interval[1];
			
			if(curr_end >= nxt_beg) {
				currInterval[1] = Math.max(curr_end, nxt_end);
			}else {
				currInterval = interval;
				ans.add(currInterval);
			}
		}
		
		
		return ans.toArray(new int[ans.size()][]);
	}
	
	
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] a = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans = merge(a);
//        for(int i = 0;i<ans.length;i++) {
//        	System.out.println(ans[0]+" "+ans[1]);
//        }
        for(int i = 0;i<ans.length;i++) {
        	for(int j = 0;j<ans[0].length;j++) {
        		System.out.print(ans[i][j]+" ");
        	}
        	System.out.println();
        }
    }
} 