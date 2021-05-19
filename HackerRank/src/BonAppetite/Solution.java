package BonAppetite;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)
			a[i] = in.nextInt();
		int b = in.nextInt();
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum += a[i];
		}
		int legal_sum = (sum - a[k])/2;
		if(b == legal_sum) {
			System.out.println("Bon Appetit");
		}else {
			int diff = (sum/2) - legal_sum;
			System.out.println(diff);
		}
	}

}
