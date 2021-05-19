package WATMELON;
import java.util.*;
class Main {
	//CORRECT
	static int sum(int[] a) {
		return  Arrays.stream(a).sum();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n+1];
			for (int i = 1; i < a.length; i++) {
				a[i] = in.nextInt();
			}
		   if(sum(a) >= 0){
		       System.out.println("YES");
		   }else{
		       System.out.println("NO");
		   }
		}
	}

}
