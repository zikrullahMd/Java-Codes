package count_and_say;

import java.util.Map.Entry;
import java.util.*;
public class Solution {
    
    public static String get(String s){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0;i<s.length();i++) {
        	int count = 0;
        	for(int j = i;j<s.length();j++) {
        		if(s.charAt(i) == s.charAt(j)) {
        			count++;
        		}
        	}
        	ans.append(count);
        	ans.append(s.charAt(i));
        }
        return ans.toString();
    }
    
    public static  String countAndSay(int n) {
        
        String[] dp = new String[n+1];
        
        dp[0] = "1";
        for(int i = 1;i<n;i++){
            dp[i] = get(dp[i-1]);
        }
        for(String s : dp) {
        	System.out.print(s+" ");
        }
        System.out.println("check "+get("1211"));
        return dp[n];
    }
    
    public static void main(String[] args) {
    	int n = 15;
    	//System.out.println(countAndSay(n));
    	System.out.println(get("11"));
    }
}


