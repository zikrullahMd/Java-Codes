package Forming_a_Magic_Square;
import java.util.*;
import java.math.*;
public class Main {
//								CORRECT
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] squares = {{8,1,6,3,5,7,4,9,2},
				{6,1,8,7,5,3,2,9,4},
				{4,9,2,3,5,7,8,1,6},
				{2,9,4,7,5,3,6,1,8},
				{8,3,4,1,5,9,6,7,2},
				{4,3,8,9,5,1,2,7,6},
				{6,7,2,1,5,9,8,3,4},
				{2,7,6,9,5,1,4,3,8}
		};
		
		
		
		
		Scanner in  = new Scanner(System.in);
		int[][] a = new int[3][3];
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				a[i][j] = in.nextInt();
			}
		}
		int cost = 0;
		
		int min = Integer.MAX_VALUE;
		int total;
		for (int i = 0; i < squares.length; i++) {
			total = 0;
			for (int j = 0; j < squares[i].length; j++) {
				total += Math.abs(a[j/3][j%3] - squares[i][j]);
			}
			if(total < min) min = total;
		}
		System.out.println(min);
		
	}

}
