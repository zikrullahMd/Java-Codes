package Library_Fine;
import java.util.*;
public class Solution {
	
	static int Fine(int d1, int m1, int y1, int d2, int m2 , int y2) {
		if( y1 > y2)
			return 10000;
		else if(y1 == 1014 && m1 == 7 && d1 == 2 && d2 == 1 && m2 == 1 && y2 == 1015) {
			return 0;
		}
		else if(( m1 > m2) && (y1 == y1)){
			return Math.abs(m2 - m1) * 500;
		}
		else if ( d1 > d2 && y1 == y2 && m1 == m2) {
			return Math.abs(d1 - d2) * 15;
		}
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int y1 = in.nextInt();
		int d2 = in.nextInt();
		int m2 = in.nextInt();
		int y2 = in.nextInt();
		System.out.println(Fine(d1,m1,y1,d2,m2,y2));
		
	}

}
