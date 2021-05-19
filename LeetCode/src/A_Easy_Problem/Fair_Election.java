package A_Easy_Problem;
import java.util.*;
public class Fair_Election {
	
	static long sum(PriorityQueue<Long> q) {
		long sum = 0;
		for(long i : q) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long t  = in.nextLong();
		while(t-->0) {
			long n = in.nextLong();
			long m = in.nextLong();
			long suma = 0;
			long sumb = 0;
			PriorityQueue<Long> qa = new PriorityQueue<>();
			PriorityQueue<Long> qb = new PriorityQueue<>(Collections.reverseOrder());
			for(long i = 0;i<n;i++) {
				qa.add(in.nextLong());
			}
			for(long i = 0;i<m;i++) {
				qb.add(in.nextLong());
			}
			for(Long i : qa) {
				suma += i;
			}
			for(Long i : qb) {
				sumb += i;
			}
			long count = 0;
			while(sum(qa) <= sum(qb)) {
				long f = qa.poll();
				long l = qb.poll();
				if(f >= l){	
					count = -1;
					break;
				}
				qa.add(l);
				qb.add(f);
				count++;
			}
			
			System.out.println(count);
		}
	}

}
