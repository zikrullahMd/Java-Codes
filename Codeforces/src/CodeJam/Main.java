package CodeJam;

import java.util.*;
class Main{
	static int getMin(int[] a, int st, int n) {
		int min = a[st];
		int idx = st;
		for(int i = st;i<n;i++) {
			if(a[i] < min) {
				min = a[i];
				idx = i;
			}
		}
		return idx;
	}
	static void printArray(int[] a, int n) {
		for(int i = 0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static void reverse(int[] a, int s , int e) {
		int i = s;
		int j = e;
		while(i<=j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int k = 1;
        while(t-->0){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }
            int count = 0;
            int j = 0;
            for(int i = 0;i<n-1;i++) {
            	j = getMin(a,i,n);
            	reverse(a,i,j);
            	count += j-i+1;
            }
            System.out.println("Case #"+k+": "+count);
            k++;		
        }
    }
}