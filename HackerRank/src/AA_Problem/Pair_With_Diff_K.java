package AA_Problem;
import java.util.*;
import java.util.Map.Entry;
public class Pair_With_Diff_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++) {
            	a[i] = in.nextInt();
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i : a) {
            	map.put(i, i-k);
            }
            boolean ans = false;
            for(Entry<Integer,Integer> entry : map.entrySet()) {
            	if(map.containsKey(entry.getValue())) {
            		ans = true;
            		break;
            	}
            }
            System.out.println(ans);
        }
	}

}
