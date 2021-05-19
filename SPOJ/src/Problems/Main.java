package Problems;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0)
		{
			for(int i=1;i<=20000;i++)
			{
				System.out.println(i*i);
				int n=in.nextInt();
				if(n==1)
				{
					System.out.flush();
					break;
				}
				else if(n==0)
				{
					System.out.flush();
					continue;
				}
				else
					System.exit(0);
			}
		}
	}

}
