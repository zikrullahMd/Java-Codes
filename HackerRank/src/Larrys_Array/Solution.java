package Larrys_Array;
import java.util.*;
class Solution {
    //   CORRECT
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }
            int count = 0;
            for(int i = 0;i<n;i++) {
                int c = 0;
                for(int j = i+1;j<n;j++) {
                    if(a[i] > a[j]) {
                        c++;
                    }
                }
                count += c;
            }
            if(count % 2 == 0) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }

}
