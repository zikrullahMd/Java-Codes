package ModeOfFrequencies;
import java.util.*;
import java.util.Map.Entry;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
			}
			HashMap<Integer,Integer> map = new HashMap<>();
			for(int i = 0;i<n;i++) {
				if(map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i])+1);
				}else {
					map.put(a[i], 1);
				}
			}
			HashMap<Integer,Integer> rmap = new HashMap<>();
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if(rmap.containsKey(entry.getValue())) {
					rmap.put(entry.getValue(), rmap.get(entry.getValue())+1);
				}else {
					rmap.put(entry.getValue(), 1);
				}
			}
			int max = 0;
			int largest = -1;
	        for(Map.Entry<Integer, Integer> entry : rmap.entrySet()){
	            int key = entry.getKey();
	            int value = entry.getValue();

	            if(value > largest)
	                largest = value;
	        }

	        int smallest = 99999999;
	        for(Map.Entry<Integer, Integer> entry : rmap.entrySet()){
	            int key = entry.getKey();
	            int value = entry.getValue();

	            if(value == largest)
	                if(key < smallest)
	                    smallest = key;
	        }

	        System.out.println(smallest);
//			for(int i = 0;i<rmap.size();i++) {
//				if(rmap.containsKey(map.get(i))) {
//					rmap.put(map.get(i),rmap.get(map.get(i))+1);
//				}
//			}
//			System.out.println(rmap);
			
			
			
		}
	}

}
