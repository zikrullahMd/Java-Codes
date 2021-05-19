package AA_Problem;
import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			String s = in.next();
			HashMap<Character, Integer> smap = new HashMap<>();
			for(int i = 0;i<s.length();i++) {
				if(smap.containsKey(s.charAt(i))) {
					smap.put(s.charAt(i), smap.get(s.charAt(i))+1);
				}else {
					smap.put(s.charAt(i), 1);
				}
			}
			System.out.println(smap.values());
			if(s.length() % 2 == 0) {
				
			}else {
				System.out.println(-1);
			}
		}
	}

}
