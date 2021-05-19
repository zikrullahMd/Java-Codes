package Lily_Homework;
import java.util.*;
import java.util.Map.Entry;
public class Main {
	
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	static int[] Sort(int[] a) {
		int n = a.length;
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++){
				if(a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		int swap = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<n;i++) {
			map.put(a[i], i);
		}
		int[] sa = Sort(a);
		for(int i = 0;i<n;i++) {
			if(a[i] != sa[i]) {
				swap++;
				int index = map.get(sa[i]);
				map.replace(map.get(a[i]),map.get(sa[i]));
				int t = a[i];
				a[i] = sa[i];
				sa[i] = t;
				
			}
		}
		System.out.println(swap);
	}
}
