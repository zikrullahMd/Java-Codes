package HOLLOW_PATTERN;


/*
 * 																			----*
																			---*-*
																			--*---* 
																			-*-----*
																			*-------*
																			 *     *
																			  *   *
																			   * *
																			    *
 * 
 * */
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j = 1;j<(i*2);j++) {
				if(j > 1 && j < (2*i)-1) {
					System.out.print(" ");
				}else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
		for(int i = n-1;i>=1;i--) {
			for(int j = n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j = 1;j<(i*2);j++) {
				if(j > 1 && j < (2*i)-1) {
					System.out.print(" ");
				}else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}

}
