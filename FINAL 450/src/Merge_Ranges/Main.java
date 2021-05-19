package Merge_Ranges;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			int a = in.nextInt();
			list.add(a);
		}
		int k = n;
		for(int i = 1;i<n-3;i+=2) {
			if(list.get(i) >= list.get(i+1)) {
				list.remove(i);
				list.remove(i);
			}
		}
		for(int i : list) {
			System.out.print(i+" ");
		}
	}
}