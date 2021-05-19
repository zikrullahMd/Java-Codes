package search_in_rotated_array;
import java.util.*;
public class Main {
	
	public static int findPiv(int[] A) {
		int start = 0, end = A.length - 1, mid;
		mid = start + (end - start) / 2;
		int last = A[A.length - 1];
		while (start <= end) {
			if (A[mid] > last) {
				start = mid + 1;
			} else if (A[mid] < last) {
				end = mid - 1;
			} else
				break;
			mid = start + (end - start) / 2;
		}
		return mid;
	}
	public static int BS(int[] a, int n,int piv, int k){
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(a[mid] == k) {
            	return mid;
            }
            else if(a[mid] >= a[low]) {
            	if(a[mid] > k && a[low] <= k) {
            		high = mid - 1;
            	}else {
            		low = mid + 1;
            	}
            }
            else
            {
                if(a[mid]<k && k<=a[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
    
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a  = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int piv = findPiv(a);
		int ans = BS(a,n,piv,k);
		System.out.println(ans);
	}

}
