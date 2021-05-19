package Interesting_XOR;
import java.awt.List;
import java.util.*;
public class Main {
	public static int log2(long n) 
    { 
  
        // calculate log2 N indirectly 
        // using log() method 
        int result = (int)(Math.log(n) / Math.log(2)); 
  
        return result; 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			long n = in.nextLong();
			//int d =(int) Math.sqrt((int) Math.pow(2, log2(n)+1));
			String s = Long.toBinaryString(n);
			int d = s.length();
			char[] a = new char[d];
			char[] b = new char[d];
			Arrays.fill(a, '0');
			Arrays.fill(b, '1');
			
			for(int i = 0;i<s.length();i++) {
				if(s.charAt(i)=='0') {
					a[i] = '1';
					b[i] = '1';
				}
			}
			a[0] = '1';
			b[0] = '0';
//			for(char i : a)
//				System.out.print(i+" ");
//			System.out.println();
//			for(char i : b)
//				System.out.print(i+" ");
			String as = new String(a);
			String bs = new String(b);
			long an = Long.parseLong(as,2);
			long bn = Long.parseLong(bs,2);
			System.out.println(an*bn);
		}
	}

}
