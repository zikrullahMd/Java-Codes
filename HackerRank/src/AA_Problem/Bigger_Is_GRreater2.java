package AA_Problem;
import java.util.*;
public class Bigger_Is_GRreater2 {
	
	static void rvereseArray(char arr[],int start, int end)
	{
			char temp;
			while (start < end)
			{
			    temp = arr[start]; 
			    arr[start] = arr[end];
			    arr[end] = temp;
			    start++;
			    end--;
			} 
	}
	
	static String Solve(char[] a) {
		boolean found = false;
		int piv = -1;
		for(int i = a.length-1;i>0;i--) {
			if(a[i] <= a[i-1]) continue;
			
			found = true;
			piv = i-1;
			break;
		}
		if(!found) return "no answer";
		
		int right = -1;
		for(int i = a.length-1;i>piv;i--) {
			if(a[i] > a[piv]) {
				right = i;
				break;
			}
		}
		
		char c = a[piv];
		a[piv] = a[right];
		a[right] = c;
		rvereseArray(a,piv+1,a.length-1);
		String ans = new String(a);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			String s = in.next();
			System.out.println(Solve(s.toCharArray()));
		}
	}

}
