package JANITOR_EFFICIENCY;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		float[] a = new float[n];
		for(int i =   0;i<n;i++) {
			a[i] = in.nextFloat();
		}
		Arrays.sort(a);
		int count = 0;
		int l_index = 0;
		for(int i = n-1;i>=0;i--) {
			if(a[i] > 1.99) {
				count++;
			}
			else if(a[i] <= 1.99) {
				if(a[i] + a[l_index] <= 3)
					l_index++;
				count++;
			}
			if(l_index > i)
				break;
		}
		System.out.println(count-1);
		//Arrays.sort(arr);
//        int left = 0;
//        int right = arr.length - 1;
//        int count = 0;
//        while(left <= right){
//            if(left == right){
//                count++;
//                break;
//            }
//            if(arr[left] + arr[right] <= 3.0){
//                left++;
//                right--;
//                count++;
//            }
//            else{
//                right--;
//                count++;
//            }
//        }
//        System.out.println(count);
	}

}
