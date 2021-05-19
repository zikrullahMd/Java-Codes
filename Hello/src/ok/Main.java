package ok;
import java.util.*;
public class Main {
	
	public void swap(ArrayList<ArrayList<Integer>> c, int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public void rotate(ArrayList<ArrayList<Integer>> a) {
	    if(a == null) return;
	    int n = a.size();
	    //Transpose
	    for(int i = 0;i<n;i++){
	        for(int j = i;j<n;j++){
	        	int temp = a.get(j).get(i);
	        	a.get(j).set(i, a.get(i).get(j));
	        	a.get(i).set(j, temp);
	        }
	    }
	    for(int i = 0;i<n;i++){
	        Collections.reverse(a.get(i));
	    }
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int n = 2;
		for(int i = 0;i<n;i++) {
			ArrayList<Integer> temp = new ArrayList<>();
			for(int j = 0;j<n;j++) {
				temp.add(in.nextInt());
			}
			list.add(temp);
		}
		Main m = new Main();
		m.rotate(list);
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(list.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
}