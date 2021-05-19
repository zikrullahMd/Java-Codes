package AA_Problem;
import java.util.*;
public class Wave_Array_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			a.add(in.nextInt());
		}
//		Method 1
//		System.out.println(a);
//		ArrayList<Integer> list = new ArrayList<>();
//		int i = 0;
//		int j = a.size()-1;
//		while(i<=j) {
//			list.add(a.get(j--));
//			list.add(a.get(i++));
//		}
//		if(n % 2 == 1) {
//			list.remove(n-1);
//		}
//		System.out.println(list);
		Collections.sort(a);
		ArrayList<Integer> list = new ArrayList<>();
		if(n % 2 == 0) {
			for(int i = 1;i<n;i+=2) {
				list.add(a.get(i));
				list.add(a.get(i-1));
			}
		}else {
			for(int i = 1;i<n;i+=2) {
				list.add(a.get(i));
				list.add(a.get(i-1));
			}
			list.add(a.get(n-1));
		}
		System.out.println(list);
	}

}
