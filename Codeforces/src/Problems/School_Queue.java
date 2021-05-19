package Problems;

import java.util.*;
class School_Queue {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    char[] a = new char[n];
    String s = in.next();
    a = s.toCharArray();
//    for(int i = 0;i<n;i++){
//      a[i] = in.next().charAt(0);
//    }
    while(k-->0){
      for(int i = 0;i<n-1;i++) {
    	  if(a[i] == 'B' && a[i+1] == 'G') {
    		  char t = a[i];
    		  a[i] = a[i+1];
    		  a[i+1] = t;
    		  i++;
    	  }
      }
    }
    String ans  ="";
    for(int f = 0;f<n;f++){
      ans += a[f];
    }
    System.out.println(ans);
  }
}
