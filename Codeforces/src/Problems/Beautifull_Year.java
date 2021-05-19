package Problems;
import java.util.*;
public class Beautifull_Year {
	
	static boolean isUnique(int n) {
		Set<Integer> set = new HashSet<>();
		while(n > 0) {
			int r = n % 10;
			set.add(r);
			n /= 10;
		}
		if(set.size() == 1) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1000;i<=10000;i++) {
			int num = i;
			boolean visited[] = new boolean[9001];
			
			while(num != 0) {
				if(visited[num % 10]) {
					break;
				}
				
				visited[num % 10 ] = true;
				num /= 10;
			}
			if(num == 0) {
				list.add(i);
			}
		}
		System.out.println(list);
		int n = in.nextInt();
		for(int i : list) {
			if(i > n) {
				System.out.println(i);
				break;
			}
		}
	}

}