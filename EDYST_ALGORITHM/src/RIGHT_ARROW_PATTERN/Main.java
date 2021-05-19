package RIGHT_ARROW_PATTERN;
import java.util.*;
/*
 * 
				*****----    
				  ****---   
				    ***--  
				      **- 
				        *
				      **- 
				    ***--  
				  ****---   
				*****----    

 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n;i++)
        {
			for(int j=0;j<n;j++){
                       if(j<i)
                    	   System.out.print("  ");
                       	else
                       		System.out.print("*");
                 }
	 

			System.out.println();
         }            
		for(int i=2;i<=n;i++){
			for(int j=0;j<n;j++){
                       if(j<n-i)
                    	   System.out.print("  ");
                       else
                    	   System.out.print("*");

             }
			System.out.println();
        }   
	}

}
