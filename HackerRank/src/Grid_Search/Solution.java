package Grid_Search;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int r = in.nextInt();
			int c = in.nextInt();
			//int[][] a = new int[r][c];
			String[][] b = new String[r][c];
			for(int i = 0;i<r;i++) {
				for(int j = 0;j<c;j++) {
					b[i][j] = in.next().split("").toString();
				}
			}
		}
	}

}







/*
 * 
2
10 10
7 2 8 3 4 5 5 8 6 4
6 7 3 1 1 5 8 6 1 9
8 9 8 8 2 4 2 6 4 3
3 8 3 0 5 8 9 3 2 4
2 2 2 9 5 0 5 8 1 3
5 6 3 3 8 4 5 3 7 4
6 4 7 3 5 3 0 2 9 3
7 0 5 3 1 0 6 6 0 1
0 8 3 4 2 8 2 9 5 6
4 6 0 7 9 2 4 1 3 7
3 4
9 5 0 5
3 8 4 5
3 5 3 0
15 15
4 0 0 4 5 3 5 9 2 1 2 6 5 6 0
1 1 4 2 1 3 1 3 3 0 9 8 6 9 2
4 7 4 3 8 6 0 8 2 8 7 9 6 4 8
5 2 2 3 5 6 9 5 1 1 8 9 1 6 9
8 8 7 1 0 9 4 5 0 4 8 7 4 9 6
2 5 2 8 0 2 6 3 3 3 8 8 7 8 2
5 0 2 7 7 1 4 8 4 9 6 6 7 4 8
0 7 5 9 7 5 2 0 7 6 9 3 7 8 0
5 1 1 7 9 9 7 8 9 5 6 2 8 0 6
4 0 4 0 0 7 4 5 4 2 7 2 5 0 4
5 4 9 0 4 3 8 0 9 9 1 6 0 8 0
9 6 2 4 1 0 8 0 9 5 3 4 8 1 1
4 4 5 8 9 3 5 2 3 7 3 3 4 7 5
7 6 8 7 0 5 3 0 3 2 1 4 1 7 4
6 5 0 6 2 9 2 7 0 8 8 7 1 6 0
2 2
9 9
9 9
 * 
 * */












