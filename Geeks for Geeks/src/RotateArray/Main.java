package RotateArray;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    public static void rotate(int[] a , int n , int d){
    	// 1 2 3 4 5  d = 2
    	
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = d;i<n;i++) {
        	list.add(a[i]);
        }
        for(int i = 0;i<d;i++) {
        	list.add(a[i]);
        }
        for(int i : list) {
        	System.out.print(i+" ");
        }
        System.out.println();
    }
    
	public static void main (String[] args) {
		//code
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
		    int n = in.nextInt();
		    int d = in.nextInt();
		    int[] a = new int[n];
		    for(int i = 0;i<n;i++)
		        a[i] = in.nextInt();
		    rotate(a,n,d);
		}
	}
}