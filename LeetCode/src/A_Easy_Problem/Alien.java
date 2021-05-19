package A_Easy_Problem;
import java.util.*;
public class Alien {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		List<String> words = new LinkedList<>();
		for(int i = 0;i<n;i++) {
			words.add(in.next());
		}
		String order = in.next();
		int[] index = new int[26];
		for(int i = 0;i<index.length;i++) {
			index[order.charAt(i) - 'a'] = i;
		}
		boolean ans = true;
		for(int i = 0;i<words.size();i++) {
			for(int j = i+1;j<words.size();j++) {
				int  min = Math.min(words.get(i).length(), words.get(j).length());
				String one = words.get(i);
				String two = words.get(j);
				for(int k = 0;k<min;k++) {
					if(index[one.charAt(k)-'a'] < index[two.charAt(k)-'a']) {
						break;
					}else if(index[one.charAt(k)-'a'] > index[two.charAt(k)-'a']) {
						
						ans = false;
						break;
					}else if(k == min-1 && one.length() > two.length()) {
						
						ans = false;
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
