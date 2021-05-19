package count_and_say;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map.Entry;
class Anagram_Palindrome {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
		    String s = in.next();
    		HashMap<Character,Integer> map = new HashMap<>();
    		int n = s.length();
    		for(int i = 0;i<n;i++) {
    			if(map.containsKey(s.charAt(i))) {
    				map.put(s.charAt(i), map.get(s.charAt(i))+1);
    			}else {
    				map.put(s.charAt(i), 1);
    			}
    		}
    		//System.out.println(map);
    		int ecount = 0;
    		int ocount = 0;
    		int count = 0;
    		for(Entry<Character,Integer> entry : map.entrySet()){
    		    if(entry.getValue() % 2 == 0){
    		        ecount++;
    		    }else{
    		        ocount++;
    		    }
    		}
    		String ans =  ocount > 1 ? "No" : "Yes";
    		System.out.println(ans);   
		}
	}
}
