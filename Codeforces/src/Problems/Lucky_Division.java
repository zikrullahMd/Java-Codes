package Problems;

import java.util.*;
import java.lang.*;
 
public class Lucky_Division
{
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    String ans = "YES";
	    if(n % 4 == 0 || n % 7 == 0 || n % 47 == 0){
	            System.out.println("YES");
	            return;
        }
	    while(n != 0){
	        int r = n % 10;
	        if(r != 4 && r!= 7){
	            ans = "NO";
	            break;
	        }
	        n /= 10;
	    }
	    System.out.println(ans);
	    
	}
}