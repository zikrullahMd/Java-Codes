package Problems;


import java.util.*;
public class Elephant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
     	int sum = 0;
     	if(n <= 5) {
     		System.out.println(1);
     	}else {
     		int count = 0;
     		for(int i = 5;i>=1;i--) {
     			count += n / i;
     			n %= i;
     		}
     		System.out.println(count);
     	}
     	
	}

}