package CodeJam;
import java.util.*;
public class MandJ {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int k = 1;
		int t = in.nextInt();
		while(t-->0) {
			int x = in.nextInt();
			int y = in.nextInt();
			String s = in.next();
			int n = s.length();
			char prev = '?';
			int cost = 0;
			for(int i = 0;i<s.length();i++) {
				if(s.charAt(i)=='C')
	            {
	                if(prev == 'J')
	                    cost+=y;
	                prev = 'C';
	            }
	            else if(s.charAt(i)=='J')
	            {
	                if(prev=='C')
	                    cost+=x;
	                prev = 'J';    
	            }else if(s.charAt(i)=='?' && (x<0 || y<0)){
                    if(prev == 'C'  )
                    {
                        if(x < 0){
                            cost+=x;
                            prev = 'J';
                        }
                        else
                            prev = 'C';
                    }
                    else if(prev == 'J' )
                {
                    if (y < 0){
                        cost+=y;
                        prev = 'C';
                    }
                    else
                        prev = 'J';
                }                
                    else
                {
                    if(x < y)
                        prev = 'C';
                    else
                        prev = 'J';
                }
	        }
			}
			
			System.out.println("Case #"+k+": "+cost);
			k++;
		}
	}

}
