package A_Boring_Apartment_CF;
import java.util.*;
class Main {
	static int[] a = {1,11,111,1111,2,22,222,2222,3,33,333,3333,4,44,444,4444,5,55,555,5555,6,66,666,6666,7,77,777,7777,8,88,888,8888,9,99,999,9999};

	static int digSum(int num) {
		int count = 0;

		for(; num != 0; num/=10, ++count) {   
        }
	    return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int count = 0;
		while(t-->0) {
			int n = in.nextInt();
			int ind = 0;	
			
			for(int i = 0;i<a.length;i++) {
				if(a[i] == n) {
					ind = i+1;
					break;
				}
			}
			count = (ind/4)*10;
			int r = ind % 4;
			switch(r) {
				case 1: count++;
				break;
				case 2: count += 3;
				break;
				case 3: count += 6;
				break;
			}
			System.out.println(count);
			
		}
	}

}
