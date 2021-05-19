package Add_one_two_number;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
class Solution {
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	  public static int [] AddOne(int [] a) {
	      /* write your solution here */
	      for(int i = a.length-1;i>=0;i--){
	          if(a[i] < 9){
	              a[i]++;
	              return a;
	          }
	          a[i] = 0;
	      }
	      int[] res = new int[a.length+1];
	      res[0] = 1;
	      int ind = -1; 
	    for (int i = 0; i < res.length; i++) { 
	        if (res[i] != 0){
	            ind = i; 
	            break;
	        } 
	    }
	    int[] b = new int[res.length - ind];
	    for (int i = 0; i < res.length - ind; i++) 
	        b[i] = res[ind + i];
	  
	    return b;
	  }
	    
	}

class Main{
	public static void  main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a= new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		Solution s = new Solution();
		int[] ans = Solution.AddOne(a);
		s.printArray(ans);
		
	}

	
}