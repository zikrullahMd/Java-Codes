package SPECIAL_SET_BIT;

import java.util.Scanner;

public class Main_2 {
	//CORRECT
	static int check(int n) {
        int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        int count=0; //special bits
        for(int prime:primes)
        {
            if((n & (1<<(prime-1)))>0)
                count++;
        }     
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] a = new int[1000001];
		a[0]=0; 
		for(int i = 1;i<a.length;i++){
		    //a[i]    //no of special bits in numbers 1....i
		    //a[i-1]  //no of special bits in numbers 1....i-1
		    a[i] = a[i-1] + check(i);
		}

		int t = in.nextInt();
		while(t-->0)
		{
		    int l = in.nextInt();
		    int r = in.nextInt();
		    //read l, r
		    System.out.println(a[r]-a[l-1]);
		}
	}

}
