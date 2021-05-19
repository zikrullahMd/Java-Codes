package MERGE_TWO_ARRAY;

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
            a[i] = in.nextInt();
        int m = in.nextInt();
        int[] b = new int[m];
        for(int i = 0;i<m;i++)
            b[i] = in.nextInt();
        int[] merged = new int[n+m];
        System.arraycopy(a, 0, merged, 0, n);  
        System.arraycopy(b, 0, merged, n, m);  
        Arrays.sort(merged);
        for (int i = 0; i < merged.length; i++) {
			System.out.print(merged[i]+" ");
		}
    }
}