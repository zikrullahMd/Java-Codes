package Twice_Counter;

import java.util.*;
class Solution
{
    public int countWords(String list[], int n)
    {
        // code here 
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i<list.length;i++){
            if(map.containsKey(list[i])){
                map.put(list[i],map.get(list[i])+1);
            }else{
                map.put(list[i],1);
            }
        }
        int count = 0;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == 2){
                count++;
            }
        }
        return count;
    }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution o = new Solution();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] a = new String[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.next();
		}
		System.out.println(o.countWords(a,n));
	}
	

}
//Tom, Jerry, Thomas, Tom, Jerry, 
//Courage, Tom, Courage