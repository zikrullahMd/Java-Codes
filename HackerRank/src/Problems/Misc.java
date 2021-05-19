package Problems;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Misc {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.next();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<s.length();i++) {
        	if(map.containsKey(s.charAt(i))) {
        		map.put(s.charAt(i), map.get(s.charAt(i))+1);
        	}else {
        		map.put(s.charAt(i), 1);
        	}
        }
        StringBuilder str = new StringBuilder();
        int i = 0;
        for(Entry<Character, Integer> entry : map.entrySet()) {
        	char c = entry.getKey();
        	Integer f = entry.getValue();
        	str.append(c);
        	str.append(f);
        }
        System.out.println(str.toString());
    }
}