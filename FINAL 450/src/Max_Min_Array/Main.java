package Max_Min_Array;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello girl, Im zikrullah, and, I'm , Here for you, okay";
		a.split("");
		System.out.println(a.split("i"));
		String[] b = a.split(",");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
