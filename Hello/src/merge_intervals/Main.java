package merge_intervals;
import java.util.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<Point> list = new ArrayList<>();
		int n = in.nextInt();
		for(int i = 0;i<n;i++) {
			list.add(new Point(in.nextInt(),in.nextInt()));
		}
		for(Point p : list) {
			System.out.println(p.x +" "+ p.y);
		}
		System.out.println("enter to enter intervals");
		Point p = new Point(in.nextInt(),in.nextInt());
		ArrayList<Point> ans = new ArrayList<>();
		
	}

}

