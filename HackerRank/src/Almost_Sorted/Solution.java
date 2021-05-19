package Almost_Sorted;
import java.util.*;
import java.math.*;
public class Solution {
	
//	static ArrayList<Integer> canSwapped(int[] a, int n){
//		
//	}
//	
//	static ArrayList<Integer> canReversed(int[] a, int n){
//		
//	}
	
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for( int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int[] b = Arrays.copyOf(a, n);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("yes");
            return;
        }
        int l,r;
        l = r = -1;
        for(int i = 0;i<n-1;i++){
            if(a[i] > a[i+1]){
                l = i;
                break;
            }
        }
        for(int i = n-1;i>=0;i--){
            if(a[i] < a[i-1]){
                r = i;
                break;
            }
        }
        int[] temp = Arrays.copyOf(a,n);
        int t = temp[l];
        temp[l] = temp[r];
        temp[r] = t;
        //printArray(temp);
        if(Arrays.equals(temp,b)){
            System.out.println("yes");
            System.out.println("swap "+(l+1)+" "+(r+1));
            return;
        }
		
		int[] tem = Arrays.copyOf(a, n);
		Arrays.sort(tem,l,r+1);
		if(Arrays.equals(tem, b)) {
			System.out.println("yes");
			System.out.println("reverse "+(l+1)+" "+(r+1));
			return;
		}
		System.out.println("no");
		
		
	}

}
