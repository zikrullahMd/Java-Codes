package AA_Problem;

import java.io.*;
import java.util.*;

public class Cabinet_Paritition {
    
    public static int Solve(int[] a, int n , int k , int min , int max){
        int low = min;
        int high = max;
        int ans = 0;
        while(low<=high){
            int mid = (low + high )/2;
            if(isValid(a,k,mid)){
                high = mid - 1;
                ans = mid;
            }else{
                low = mid + 1;
            }
            
        }
        return ans;
    }
    public static boolean isValid(int[] a, int k, int tocheck){
        int count = 0;
        int sum = 0;
        int n = a.length;
        for(int i = 0;i<n;i++){
            sum += a[i];
            if(sum > tocheck){
                count++;
                sum = a[i];
            }
        }
        count++;
        return count <= k;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            int sum = 0;
            int min = Integer.MIN_VALUE;
            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();
                sum += a[i];
                min = Integer.max(min,a[i]);
            }
            System.out.println(Solve(a,n,k,min,sum));
        }
    }
}