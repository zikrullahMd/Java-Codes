package Problems;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UniqueElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<n;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i],map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
        for(Entry<Integer,Integer> entry : map.entrySet()) {
        	if(entry.getValue() == 1) {
        		System.out.print(entry.getKey()+" ");
        	}
        }
    }
}