package AA_Problem;
import java.util.*;
import java.util.Map.Entry;
public class Greater_Than_Nby3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			list.add(in.nextInt());
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<n;i++) {
			if(map.containsKey(list.get(i))) {
				map.put(list.get(i), map.get(list.get(i))+1);
			}else {
				map.put(list.get(i), 1);
			}
		}
		int ans = -1;
		for(Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue() > n/3) {
				ans = entry.getKey();
				break;
			}
		}
		System.out.println(ans);
	}

}
