package Find_Dublicate;
import java.util.*;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<n;i++) {
			int e = in.nextInt();
			if(map.containsKey(e)) {
				map.put(e, map.get(e)+1);
			}else {
				map.put(e, 1);
			}
		}
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println("It contains dublicate, i.e. "+entry.getValue());			}
		}
		
	}

}
