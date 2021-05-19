package CHAKRAVYUHA;
import java.util.*;
public class Main {
	static void print(int[][] a) {
		int n = a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] a = new int[n][n];
		int pp = 1 + (n*n)/11;
		
		int[] power = new int[2*pp];//to store pp indices
		power[0] = power[1] = 0;
		
		int counter = 1;
		int ppcounter = 2;
		
		int row = 0; int col = 0; 
		int end_row = 0; int end_col = 0;//ending of current printing
		
		
		
		for(int i = 0;i<n/2;i++) {//no of squares
			row = col = i;
			end_col = n-i-1;
			while(col < end_col) {//print the top row
				a[row][col] = counter;
				if(counter % 11 == 0) {
					power[ppcounter] = row;
					power[ppcounter+1] = col;
					ppcounter += 2;
				}
				counter++;
				col++;
			}
			end_row = n-i-1;
			while(row<end_row) {//printing last column
				a[row][col] = counter;
				if(counter % 11 == 0) {
					power[ppcounter] = row;
					power[ppcounter+1] = col;
					ppcounter += 2;
				}
				counter++;
				row++;
			}
			
			end_col = i;
			while(col > end_col) {//printing last row
				a[row][col]= counter;
				if(counter % 11 == 0) {
					power[ppcounter] = row;
					power[ppcounter+1] = col;
					ppcounter += 2;
				}
				counter++;
				col--;
			}
			
			end_row = i;
			while(row>end_row) {//printing first column
				a[row][col] = counter;
				if(counter % 11 == 0) {
					power[ppcounter] = row;
					power[ppcounter+1] = col;
					ppcounter += 2;
				}
				counter++;
				row--;
			}
		}
		if(n % 2 == 1) {
			a[n/2][n/2] = n*n;
			if((n*n) % 11 == 0) {
				power[ppcounter] = n/2;
				power[ppcounter+1] = n/2;
				ppcounter += 2;
			}
		}
		print(a);
		System.out.println("Total Power points : "+pp);
		for(int i = 0;i<power.length;i+=2) {
			System.out.println("("+power[i]+","+power[i+1]+")");
		}
	}

}
