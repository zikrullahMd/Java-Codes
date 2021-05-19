package Problems;

import java.awt.Point;
import java.util.*;
public class BCD_length{
	
	public static void swap(long a, long b) {
		long t = a;
		a = b;
		b = t;
	}
	
	public static long length(long n) {
		long count = 0;
		while(n>0) {
			n/=10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Long> list = new ArrayList<>();
		list.add((long) 3);
		list.add((long)11);
		list.add((long)101);
		list.add((long)1009);
		list.add((long)10007);
		list.add((long)100003);
		list.add((long)1000003);
		list.add((long)10000019);
		list.add((long)100030001);
		long t =in.nextLong();
		while(t-->0) {
			long a = in.nextLong();
			long b = in.nextLong();
			long c = in.nextLong();
			
			long x = 0;
			long y = 0;
			long z = list.get((int) (c-1));
			int s = 0;
			while(true) {
				long p = z;
				while(p > 0) {
					p /= 10;
					s++;
				}
				if(s == a) {
					x = z;
					break;
				}
				z *= 2;
				s=0;
			}
			z = list.get((int) (c-1));
			s = 0;
			while(true) {
				long p = z;
				while(p > 0) {
					p /= 10;
					s++;
				}
				if(s == b) {
					y = z;
					break;
				}
				z *= 3;
				s=0;
			}
			System.out.println(x+" "+y);
		}
	}
}
