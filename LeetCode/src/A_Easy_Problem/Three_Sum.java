 package A_Easy_Problem;
import java.util.*;
public class Three_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		for(int i = 0;i<n-2;i++) {
			 // check for the duplicates
			if(i == 0 || a[i] != a[i-1]) {
				
				int sum = 0 - a[i];
				int l = i+1;
				int h = n-1;
				while(l<h) {
					if(a[l] + a[h] == sum) {
						System.out.print(a[i]+" "+a[l]+" "+a[h]);
						while(l<h && a[l] == a[l+1]) l++;
						while(l<h && a[h] == a[h-1]) h--;
						l++;
						h--;
					}else if(a[l] + a[h] > sum) {
						h--;
					}else {
						l++;
					}
				}
			}
		}
	}

}
