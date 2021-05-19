/*
20
5 17
15 13 28 1 24
0 0 0 0 7
3 2
29 27 7
5 3 7
6 1
22 23 25 30 24 26
6 7 25 30 24 26
9 19
4 21 30 14 3 18 30 6 24
0 0 0 0 0 0 0 0 16
3 8
1 29 16
0 0 12
9 2
7 6 30 17 27 28 11 17 13
1 0 30 17 27 28 11 17 13
2 9
21 19
0 6
6 5
25 22 3 20 3 20
0 0 0 16 3 28
2 3
22 26
0 12
9 10
19 23 18 24 2 13 17 6 16
0 0 0 0 0 0 0 2 4
4 19
25 3 9 19
0 0 0 0
5 6
1 19 19 25 29
0 0 0 0 5
8 15
16 7 16 3 9 13 12 30
0 0 0 0 0 0 0 18
4 6
28 6 21 18
0 0 0 29
6 9
7 10 29 8 20 5
0 0 0 0 0 9
10 19
5 19 14 23 6 14 13 18 9 30
0 0 0 0 0 0 0 0 0 15
3 7
3 13 16
0 0 30
10 9
19 1 12 18 16 4 24 24 3 25
0 0 0 0 0 0 0 0 1 3
10 15
9 14 4 5 24 16 5 25 22 16
0 0 0 0 0 0 0 0 0 20
10 15
3 28 7 20 19 29 20 13 26 21
0 0 0 0 0 0 0 0 0 20
 * 
 * 
 * */



package Hail_XOR;
import java.util.*;
public class Main {
	static int[] Reverse(int[] a) {
		int[] b = new int[a.length];
		for(int i = a.length-1;i>=0;i--) {
			b[i] = a[i];
		}
		return b;
	}
	static int k = 30;
	static int[] a = new int[100001];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			long n = in.nextLong();
			long x = in.nextLong();
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
			}
			ArrayList<ArrayList<Long>> b = new ArrayList<ArrayList<Long>>();
			for(int i = 0;i<n-1;i++) {
				for(int j = 0;j<32;j++) {
					if((a[i]&(1<<j)) > 0) {
						b.get(j).get(i);
					}
				}
			}
			Collections.reverse(b);
			
			for(int i = 0;i<n;i++) {
				for(int j = 31;(j>=0 & x) >0;j--) {
					
				}
			}
		}
		
	}

}
