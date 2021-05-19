package FirstChar_of_each_word;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Geeks for Geeks";
		String[] g = s.split(" ");
		int n = g.length;
		String ans = "";
		for(int i = 0;i<n;i++) {
			ans += g[i].charAt(0);
		}
		System.out.println(ans);
		
	}

}
