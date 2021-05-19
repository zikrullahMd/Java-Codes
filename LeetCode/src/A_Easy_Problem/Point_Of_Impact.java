package A_Easy_Problem;
import java.util.*;
class Point_Of_Impact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			long n = in.nextLong();
			long k = in.nextLong();
			long x = in.nextLong();
			long y = in.nextLong();
			Pairs[] a = new Pairs[4];
			if(x == y ) {
				System.out.println(n+" "+n);
				continue;
			}
			else if(x > y)
			{
				Pairs one = new Pairs(n,(n-x)+y);
				Pairs two = new Pairs(n-x+y,n);
				Pairs three = new Pairs(0,x-y);
				Pairs four = new Pairs(x-y,0);
				a[1] = one;
				a[2] = two;
				a[3] = three;
				a[0] = four;
		    }
		    else {
				Pairs one = new Pairs((n-y)+x,n);
				Pairs two = new Pairs(n,(n-y)+x);
				Pairs three = new Pairs(y-x,0);
				Pairs four = new Pairs(0,y-x);
				a[1] = one;
				a[2] = two;
				a[3] = three;
				a[0] = four;
				
			}
		    System.out.println(a[(int)k%4].x+" "+a[(int)k%4].y);
			
		}
		
	}

}

class Pairs{
	long x;
	long y;
	public Pairs(long x, long y) {
		this.x = x;
		this.y = y;
	}
}