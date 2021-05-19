package Paparazzi_Gennadi;
import java.awt.Point;
import java.util.*;
public class Main {
	
	public static boolean check(List<Point> list ,int a, int b) {
		for(int i = a;i<b;i++) {
			if(list.get(i).x > )
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
			}
			if(n == 2) {
				System.out.println(a[1] - a[0]);
				return;
			}
			List<Point> list = new ArrayList<>();
			for(int i = 0;i<n;i++) {
				 Point p = new Point(i+1,a[i]);
				 list.add(p);
			}
			int max = Integer.MIN_VALUE;
			for(int i = 0;i<n;i++) {
				for(int j = i+1;j<n;j++) {
					if(check(list,i,j,list.get(i),)) {
						int currmax = j-i;
						max = Integer.max(max,currmax);
					}
				}
			}
			System.out.println(max);
		}
	}

}
