package Frequency_Queries;
import java.util.*;
public class Main {
    static HashMap<Long,Long> map = new HashMap<>();
    
    
    public static void Insert(long i) {
        if(map.containsKey(i)) {
            map.put(i, map.get(i)+1);
        }else {
            map.put(i, (long) 1);
        }
    }
    public static void Delete(long i) {
        map.remove(i);
    }
    public static long Check(long i) {
        if(map.containsValue(i))
            return 1;
        else
            return 0;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        while(t-->0) {
            long n = in.nextLong();
            if(n == 1) {
                long e = in.nextLong();
                Insert(e);
            }else if(n == 2) {
                long e = in.nextLong();
                Delete(e);
            }else if(n == 3) {
                long e = in.nextLong();
                System.out.println(Check(e));
            }
        }
    }

}
