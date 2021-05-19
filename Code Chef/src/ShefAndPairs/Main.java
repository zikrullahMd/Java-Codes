package ShefAndPairs;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = in.nextInt();
			}
			int count = 0;
//          Method 1:
//			for(int i = 0;i<n;i++) {
//				if(a[i] % 2 == 0) {
//					for(int j = i;j<n;j++) {
//						if(a[j] % 2 == 1) {
//							count++;
//						}
//					}
//				}
//			}
			
//			Method 2:
			int i = 0;
			int j = n-1;
			while(i < j) {
				if(a[i] % 2 == 0) {
					if(a[j] % 2 == 1) {
						count++;
					} 
if(j == i+1) {
i++;
j=n-1;
continue;
} 
j--;
				}
else {
					i++;
           j = n-1;
				}
			}
			System.out.println(count);
		}
	}
}