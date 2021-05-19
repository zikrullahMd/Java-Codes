package GROOVING_MONKEYS;
import java.util.*;
public class Main {
	
	static boolean check(int[] a) {
		for(int i = 0;i<a.length-1;i++) {
			if(a[i] > a[i+1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = in.nextInt();
			}
			int[] x = new int[n+1];
			int[] s = Arrays.copyOf(a, n+1);
			Arrays.sort(s);
			int temp = 0;
			int c = 1;
			int i = 0;
			while(true) {
				if(x.equals(s)) {
					break;
				}
				x[a[i]] = s[i];
				i++;
				temp++;
			}
			System.out.println(temp); 
		}
	}

}
