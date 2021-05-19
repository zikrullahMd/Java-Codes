package LEFT_ARROW_PATTERN;
import java.util.*;
public class Main {
	
	/*
	    * * * * * * * * * * 
		* * * * * * * * _ _
		* * * * * * _ _ _ _
		* * * * _ _ _ _ _ _
		* * _ _ _ _ _ _ _ _
		* * _ _ _ _ _ _ _ _
		* * * * _ _ _ _ _ _
		* * * * * * _ _ _ _
		* * * * * * * * _ _
		* * * * * * * * * * 
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<(n*2)-2*i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i = n-1;i>=0;i--) {
			for(int j = 0;j<(n*2)-2*i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
