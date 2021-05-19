package A_Easy_Problem;
import java.util.*;
import java.util.Map.Entry;
public class SortCharBy_Freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String ans = "";
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i = 0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		
		HashMap<Character,Integer> sorted = sort(map);
		System.out.println(sorted);
		for(Entry<Character,Integer> entry : sorted.entrySet()) {
			ans += entry.getKey();
		}
		System.out.println(ans);

	}
	
	
	static  HashMap<Character,Integer> sort(HashMap<Character,Integer> hm){
		
		List<Entry<Character,Integer>> list = new LinkedList<Entry<Character,Integer>>(hm.entrySet());
		
		Collections.sort(list,new Comparator<Map.Entry<Character, Integer>>(){
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		
		
		HashMap<Character,Integer> temp = new LinkedHashMap<Character,Integer>();
		for(Entry<Character,Integer> entry : hm.entrySet()) {
			temp.put(entry.getKey(), entry.getValue());
		}
		return temp;
		
	}

}
