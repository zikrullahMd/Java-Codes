package del;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		Object[] a = list.toArray();
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
