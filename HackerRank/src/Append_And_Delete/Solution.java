package Append_And_Delete;
import java.util.*;
public class Solution {
	static int countPairs(String s1, int n1,  
            String s2, int n2) 
{ 

// To store the frequencies of characters 
// of string s1 and s2 
int []freq1 = new int[26]; 
int []freq2 = new int[26]; 
Arrays.fill(freq1, 0); 
Arrays.fill(freq2, 0); 

// To store the count of valid pairs 
int i, count = 0; 

// Update the frequencies of 
// the characters of string s1 
for (i = 0; i < n1; i++) 
freq1[s1.charAt(i) - 'a']++; 

// Update the frequencies of 
// the characters of string s2 
for (i = 0; i < n2; i++) 
freq2[s2.charAt(i) - 'a']++; 

// Find the count of valid pairs 
for (i = 0; i < 26; i++) 
count += (Math.min(freq1[i], freq2[i])); 

return count; 
} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		int k = in.nextInt();
		int count = countPairs(s,s.length(),t,t.length());
		int d = s.length()- count;
		int e = 0;
		for(int i = 0;i<s.length();i++) {
			for(int j = 0;j<t.length();j++) {
				if(s.charAt(i) != t.charAt(j)) {
					e = i;
					break;
				}
			}
		}
		System.out.println("e "+e);
		if( k > d)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
