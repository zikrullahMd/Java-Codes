package Problems;
import java.util.*;
public class Candy_1 {
	
	public static boolean isEqual(Integer arr[])
    {
        // Put all array elements in a HashSet
        Set<Integer> s = new HashSet<>(Arrays.asList(arr));
 
        // If all elements are same, size of
        // HashSet should be 1. As HashSet contains only distinct values.
        return (s.size() == 1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t;
		while((t = in.nextInt()) != -1) {
			
			
			Integer[] a = new Integer[t];
			for(int i = 0;i<t;i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			int r = a[t-1] - a[0];
			int i = 0;
			int x = 0;
			while(r!=0 && i < t-1) {
				a[i++]++;
				a[t-1]--;
				x++;
			}
//			for(int f = 0;f<t;f++) {
//				System.out.print(a[f]+" ");
//			}
			//System.out.println(x);
			if(isEqual(a)) {
				System.out.println(x);
			}else {
				System.out.println(-1);
			}
		}
	}

}
