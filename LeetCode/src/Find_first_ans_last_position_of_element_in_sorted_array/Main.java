package Find_first_ans_last_position_of_element_in_sorted_array;

import java.util.*;
import java.math.*;
import java.util.Map.Entry;
class Main{
	
	
	public static int getMax(int[] a, int k) {
		int low = 0;
		int high = a.length - 1;
		int index = -1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(a[mid] <= k) {
				low = mid + 1;
			}
			if(a[mid] > k) {
				high = mid - 1;
			}
			if(a[mid] == k) {
				index = mid;
			}
		}
		return index;
	}
	
	public static int getMin(int[] a, int k) {
		int low = 0;
		int high = a.length - 1;
		int index = -1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(a[mid] >= k) {
				high = mid - 1;
			}
			if(a[mid] < k) {
				low = mid + 1;
			}
			if(a[mid] == k) {
				index = mid;
			}
		}
		return index;
	}
	
	
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] a = {5,7,7,8,8,10};
        int k = 8;
        //System.out.println(getMin(a,k)+" "+getMax(a,k));
        System.out.println(getMin(a,k) + " "+getMax(a,k));
    }
} 