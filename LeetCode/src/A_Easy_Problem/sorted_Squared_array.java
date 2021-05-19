package A_Easy_Problem;
import java.util.*;
public class sorted_Squared_array {
	
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	//Noob Approact - Time Complexity -> O(nLogn)
	static int[] getSortedSquared(int[] a) {
		for(int i = 0;i<a.length;i++) {
			a[i] = a[i] * a[i];
		}
		Arrays.sort(a);
		return a;
	}

	// Pro approach - Time Complexity -> O(N)
	static int[] getSorted(int[] a) {
		int[] b = new int[a.length];
		int k = b.length-1;
		int i = 0;
		int j = a.length - 1;
		while(i<=j) {
			if(a[i]*a[i] > a[j]*a[j]) {
				b[k--] = a[i];
				i++;
			}else {
				b[k--] = a[j];
				j--;
			}
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-6,-4,1,2,3,5};
		int[] res = getSortedSquared(a);
		int[] res2 = getSorted(a);
		printArray(res);
		printArray(res2);
	}

}
