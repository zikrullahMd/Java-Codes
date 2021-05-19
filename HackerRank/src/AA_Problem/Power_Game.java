package AA_Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Power_Game {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Integer> inputArray(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++) {
            list.add(in.nextInt());
        }
        return list;
    }
    static void print(int a) {
        System.out.println(a);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            ArrayList<Integer> a = inputArray(n);
            ArrayList<Integer> b = inputArray(n);
            boolean[] vis = new boolean[n];
            int count = 0;
            Collections.sort(a);
            int tempp = n;
            for(int i = 0;i<tempp;i++){
                for(int j = 0;j<n;j++){
                    if(a.get(i) > b.get(j)) {
                        count++;
                        b.remove(b.get(j));
                        n--;
                        break;
                    }
                }
            }
            print(count);
        }
    }

}