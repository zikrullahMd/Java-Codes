import java.util.*;
import java.math.*;
import java.util.Map.Entry;
class Misc{
	
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n+1][n+1];
        int left = 0;
        int top = 0;
        int right = a[0].length-1;
        int bottom = a.length-1;
        int num = 1;
        while(num <= n*n){
            for(int i = left;i<=right;i++){
                a[top][i] = num++;
            }
            top++;
            for(int i = top;i<=bottom;i++){
                a[i][right] = num++;
            }
            right--;
            for(int i = right;i>=left;i--){
                a[bottom][i] = num++;
            }
            bottom--;
            for(int i = bottom;i>=top;i--){
                a[i][left] = num++;
            }
            left++;
        }
        for(int i = 0;i<a.length;i++) {
        	for(int j = 0;j<a[0].length;j++) {
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }
    }
}
