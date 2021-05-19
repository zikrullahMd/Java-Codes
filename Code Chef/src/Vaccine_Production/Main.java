package Vaccine_Production;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int d1 = in.nextInt();
		int v1 = in.nextInt();
		int d2 = in.nextInt();
		int v2 = in.nextInt();
		int p = in.nextInt();
		int t = 0;
		int d = 0;
		while(t<p) {
			int vac1 = 0;
			if(d>=d1 && d >=d2) {
				vac1 = v1 + v2; 
			}
			else if(d>=d2) {
				vac1 = v2;
			}
			else if(d >= d1) {
				vac1 = v1;
			}
			t += vac1;
			d++;
		}
		System.out.println(d-1);
		
	}

}
