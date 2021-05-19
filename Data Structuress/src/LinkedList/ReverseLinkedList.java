package LinkedList;
import java.util.*;
import LinkedList.LinkedList.Node;
public class ReverseLinkedList {
	protected Node Reverse(Node head) {
		Node prev = null;
		while(head != null) {
			Node next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}
}
