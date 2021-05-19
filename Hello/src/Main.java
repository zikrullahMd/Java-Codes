import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello again");
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0;i<5;i++) {
			a.add(i);
		}
		for(int i : a)
			System.out.println(i);
	}

}