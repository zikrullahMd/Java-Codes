package AA_Problem;
import java.util.*;
public class Jesse_And_Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		PriorityQueue<Integer> q = new PriorityQueue<>();
		PriorityQueue<Integer> z = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0;i<n;i++) {
			int e = in.nextInt();
			q.add(e);
			z.add(e);
		}
		//System.out.println(q);
		
		
		System.out.println(z.peek());
		if(z.peek() > k) {
			System.out.println(-1);
			return;
		}
		int count = 0;
		while(q.peek() < k) {
			if(q.size() >= 2) {
				int f = q.poll();
				int s = q.poll();
				int r = f*1 + s * 2;
				q.add(r);
				count++;
			}else {
				count = -1;
				break;
			}
		}
		System.out.println(count);
	}

}
