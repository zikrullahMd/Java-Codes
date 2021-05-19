package HashTree;
import java.util.*;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		Map<Integer,Integer> map = new TreeMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(a[i])){
            	map.put(a[i], map.get(a[i]) + 1);
            }else{
                map.put(a[i],1);
            }
        }
        
        NavigableMap<Integer, Integer> map2 = ((TreeMap<Integer, Integer>) map).descendingMap();
        int min = Collections.min(map.values());
        int ans = 0;
        for(Map.Entry<Integer, Integer> entry : map2.entrySet()){
            if(entry.getValue() <= min){
                ans = entry.getKey();
                break;
            }
        }
        System.out.println(ans);
	}

}
