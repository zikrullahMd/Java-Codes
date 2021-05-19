package Problems;

import java.math.BigInteger;
import java.util.*;
public class NXT_Pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t-->0) {
			BigInteger n_i = new BigInteger(in.next());
			while(true)
			{
				
				n_i.add(BigInteger.valueOf(1));
				StringBuilder sb = new StringBuilder(n_i.toString());
				if(sb.equals(sb.reverse()))
				{
					System.out.println(sb.toString());
					break;
				}			
				
			}
		}
		
		in.close();
	}

}