package Problems;
import java.util.*;
public class String_LCM {
	static int gcd(int a, int b)
    {
        if (a == 0)
            return b; 
        return gcd(b % a, a); 
    }
     
    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			String a = in.next();
			String b = in.next();
			Set<Character> set = new HashSet<>();
			int len = 0;
			if(a.length() > b.length()) {
				for(int i = 0;i<a.length();i++) {
					if(!set.contains(a.charAt(i))) {
						set.add(a.charAt(i));
					}else {
						break;
					}
				}
				len = set.size();
			}else {
				for(int i = 0;i<b.length();i++) {
					if(!set.contains(b.charAt(i))) {
						set.add(b.charAt(i));
					}else {
						break;
					}
				}
				len = set.size();
			}
			
			if(a.length() % len != 0 || b.length() % len != 0) {
				System.out.println(-1);
			}else {
				int lcm = lcm(a.length(),b.length());
				if(a.length() < b.length()) {
					String str = a.substring(0,len);
					String ans = "";
					for(int i = 0;i<lcm/len;i++) {
						ans += str;
					}
					System.out.println(ans);
				}else {
					String str = b.substring(0,len);
					String ans = "";
					for(int i = 0;i<lcm/len;i++) {
						ans += str;
					}
					System.out.println(ans);
				}
				
			}
		}
	}
 
}