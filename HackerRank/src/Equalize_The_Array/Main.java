package Equalize_The_Array;
import java.util.*;
class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+1);
            }else {
                map.put(a[i], 1);
            }
        }
        int max = Collections.max(map.values());
        int count = 0;
        for(int i : map.values()) {
            if(i < max) {
                count+=i;
            }
        }
        System.out.println(n - max);
    }

}
