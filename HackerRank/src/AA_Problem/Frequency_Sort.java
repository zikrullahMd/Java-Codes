// Java program to sort hashmap by values 
package AA_Problem;
import java.util.*;
import java.util.Map.Entry;
import java.lang.*; 

public class Frequency_Sort { 

	// function to sort hashmap by values 
	static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
	{ 
		// Create a list from elements of HashMap 
		List<Map.Entry<Integer, Integer> > list = 
			new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 

		// Sort the list 
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
			public int compare(Map.Entry<Integer, Integer> o1, 
							Map.Entry<Integer, Integer> o2) 
			{ 
				return (o1.getValue()).compareTo(o2.getValue()); 
			} 
		}); 
		
		// put data from sorted list to hashmap 
		HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
		for (Map.Entry<Integer, Integer> aa : list) { 
			temp.put(aa.getKey(), aa.getValue()); 
		} 
		return temp; 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				a[i] = in.nextInt();
			}
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
		for(int i = 0;i<n;i++) {
			if(hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i])+1);
			}else {
				hm.put(a[i], 1);
			}
		}
		// enter data into hashmap 
		
		Map<Integer, Integer> hm1 = sortByValue(hm);

		// print the sorted hashmap 
		ArrayList<Integer> ans = new ArrayList<>();
        for(Entry<Integer,Integer> entry : hm1.entrySet()) {
        	for(int i = 0;i<entry.getValue();i++) {
        		ans.add(entry.getKey());
        	}
        }
        for(int  i : ans) {
        	System.out.print(i+" ");
        }
        System.out.println();
		}
	} 
} 
