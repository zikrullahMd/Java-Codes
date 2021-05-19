package Alternate_Rearrangement;
import java.util.*;
public class Main_Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("hello");
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
//   	Method 1 (Naive)
//		for(int x = 0;x<n;x++) {
//			System.out.print(a[x]+" ");
//		}
//		System.out.println();
//		int k = 0;
//		for(int i = 0;i<n;i++) {
//			if(a[i] > 0) {
//				k = i;
//				break;
//			}
//		}
//		System.out.println("k " +k);
//		int[] temp = new int[n];
//		int i = 0;
//		int j = k;
//		int f = 0;
//		while(i<=k && j<n) {
//			temp[f++] = a[i++];
//			temp[f++] = a[j++];
//		}
//		for(int x = 0;x<n;x++) {
//			System.out.print(temp[x]+" ");
//		}
		int sum = 0;
		boolean found = false;
		Set<Integer> set = new HashSet<>();
		for(int i = 0;i<n;i++) {
			sum += a[i];
			System.out.println(i+" "+set);
			if(set.contains(sum)) {
				found = true;
				break;
			}
			set.add(sum);
		}
		System.out.println(found);
		
	}

}
