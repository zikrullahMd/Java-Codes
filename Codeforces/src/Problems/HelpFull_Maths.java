package Problems;
import java.util.*;
public class HelpFull_Maths {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i<s.length();i+=2) {
			list.add(Integer.parseInt(s.valueOf(s.charAt(i))));
		}
		Collections.sort(list);
		StringBuilder ans = new StringBuilder();
		for(int i : list) {
			//ans += i+"+";
			ans.append(i+"+");
		}
		StringBuilder str = new StringBuilder(ans);
		ans = str.deleteCharAt(str.length()-1);
		System.out.println(ans);
	}
}
