package BetweenTwoSets;
import java.util.*;
public class Main {
	static int gcd(int a, int b) {
		if(a == 0)
			return b;
		return gcd(b%a,a);
	}
	static int lcm(int a , int b) {
		return (a*b)/gcd(a,b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int m = in.nextInt();
		int[] ar = new int[l];
		int[] br = new int[m];
		for(int i = 0;i<l;i++)
			ar[i] = in.nextInt();
		for(int i = 0;i<m;i++)
			br[i] = in.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		for (int i = 0; i < ar.length; i++) {
			a.add(ar[i]);
		}
		for (int i = 0; i < br.length; i++) {
			b.add(br[i]);
		}
		int lcm = a.get(0);
        int gcd = b.get(0);
        for(int i = 0;i<a.size();i++){
            lcm = lcm(lcm,a.get(i));
        }
        for(int i = 0;i<b.size();i++){
            lcm = lcm(lcm,b.get(i));
        }
        int i = 1;
        int n = 0;
        int count = 0;
        while(n < gcd){
            n = lcm * i;
            if(gcd % n == 0){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
		
}
	


