package Pair_with_diff_K;
import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = in.nextInt();
			}
			int k = in.nextInt();
			int flag = 0;
			int i = 0;
			int j = 1;
			while(i < n && j < n) {
				int diff = a[j] - a[i];
				if(i!=j && diff == k) {
					flag = 1;
					break;
				}
				else if(diff < k) {
					j++;
				}else {
					i++;
				}
			}
			System.out.println(flag);
		}
	}

}
