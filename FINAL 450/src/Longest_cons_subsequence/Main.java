package Longest_cons_subsequence;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		Set<Integer> set = new HashSet<>();
		for(int i = 0;i<n;i++) {
			set.add(a[i]);
		}
		int longest = 0;
		for(int i = 0;i<n;i++) {
			int lon = 0;
			for(int j = i+1;j<n;j++) {
				if(a[j] == a[i]++) {
					lon++;
				}
				
			}
			longest = Integer.max(longest, lon);
		}
		System.out.println(longest);
	}

}
