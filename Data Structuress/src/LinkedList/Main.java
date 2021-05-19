package LinkedList;
import java.util.*;

import LinkedList.LinkedList.Node;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		ReverseLinkedList rev = new ReverseLinkedList();
		ArrayList<Integer> list =new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0;i<n;i++) {
			l.add(in.nextInt());
		}
//		l.printLL(l.head);
//		System.out.println();
//		System.out.println("want to enter at specific postion? If yes press 2 or -1");
//		int f = in.nextInt();
//		if(f > 0) {
//			l.addAt(in.nextInt(), in.nextInt());
//		}
//		l.printLL(l.head);
//		System.out.println(l.head);
		//l.swap(l.head,1,2);
		Node reversed = rev.Reverse(l.head);
		l.printLL(reversed);
	}

}
