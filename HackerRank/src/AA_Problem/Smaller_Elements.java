package AA_Problem;
import java.util.*;
public class Smaller_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++) {
            	a[i] = in.nextInt();
            }
            int count = 0;
            for(int i = 0;i<n;i++) {
            	int rcount = 0;
            	for(int j = i+1;j<n;j++) {
            		if(a[j] < a[i]) {
            			rcount++;
            		}
            	}
            	count += rcount;
            }
            System.out.println(count);
        }
	}

}
