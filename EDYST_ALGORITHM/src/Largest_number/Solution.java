package Largest_number;
import java.util.*;
import java.util.Comparator;
class Solution {
static public String largestNumber(String[] a) {

    List<String> list = new ArrayList<String>();
    
    for(int i=0;i<a.length;i++){
        
        list.add(String.valueOf(a[i]));
    }
    
    Collections.sort(list,new Comparator<String>(){
       
        public int compare(String A,String B){
            
            
            String AB = A+B;
            String BA = B+A;
            
            return AB.compareTo(BA) > 0 ? -1 : 1;
        }
        
    });
    
    String res = "";
     for(int i=0;i<list.size();i++){
         res += list.get(i);
    }
    
    if(res.charAt(0) == '0')
        return "0";
    
    return res;
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] a = new String[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.next();
		}
		System.out.println(largestNumber(a));
	}
}
