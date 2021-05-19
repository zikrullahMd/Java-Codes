package Sherlock_And_Valid_String;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i = 0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		int max = Integer.MIN_VALUE;
		boolean ans = false;
		for(int i : map.values()) {
			max = Math.max(max, i);
			//to determine if all the elements in list is equal or not
			if(new HashSet<Integer>(map.values()).size() <= 1){
				ans = true;
				break;
			}
		}
		int maxi = Collections.max(map.values());
		int mini = Collections.min(map.values());
		if(ans || maxi - mini == 1) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

}
