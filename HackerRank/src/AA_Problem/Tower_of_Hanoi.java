package AA_Problem;
import java.io.*;
import java.util.*;

public class Tower_of_Hanoi {
	
	static void TOH(int n, char from , char to, char aux) {
		if(n == 1) {
			System.out.println("Move "+n+" from "+from+" to "+to);
			return;
		}
		TOH(n-1,from,aux,to);
		System.out.println("Move "+n+" from "+from+" to "+to);
		TOH(n-1,aux,to,from);
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            TOH(n,'A','C','B');
        }
    }
}