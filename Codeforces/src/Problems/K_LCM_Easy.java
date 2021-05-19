package Problems;
import java.util.*;
public class K_LCM_Easy {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int k = in.nextInt();
			if(n % 2 == 0) {
				if(n % 4 == 0) {
					System.out.println(n/2+" "+n/4+" "+n/4);
					
				}else {
					System.out.println(2+" "+(n-2)/2+" "+(n-2)/2);
				}
			}else {
				System.out.println(1+" "+n/2+" "+n/2);
			}
		}
	}

}
