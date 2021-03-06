package LinkedList;
import java.util.*;
public class LinkedList {
	
	public class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		next = null;
	}
	// head pointing to the head node
	
	}
	Node head;
	
	// Method to add new node at last
	public void add(int data) {
		Node nn = new Node(data);
		// if the linked list is empty then point the head to the new node.
		if(head == null) {
			head = nn;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = nn;
	}
	
	//Method to add element at first
	
	public void addFirst(int data) {
		Node nn = new Node(data);
		if(head == null) {
			head = nn;
			return;
		}
		nn.next = head;
		head = nn;
	}
	
	// Method to add element at specific postion
	public void addAt(int data, int pos) {
		Node nn = new Node(data);
		if(head == null) {
			head = nn;
			return;
		}
		Node temp =head;
		int i = 0;
		while(i < pos-1) {
			temp = temp.next;
			i++;
		}
		nn.next = temp.next;
		temp.next = nn;
	}
	
	public int get(LinkedList l,int i) {
		Node temp = l.head;
		int j = 0;
		while(temp.next != null) {
			if(j == i) {
				return temp.data;
			}
			j++;
		}
		return -1;
	}
	
//	public static void swap(Node head,int a, int b) {
//		Node first = head;
//		Node second = head;
//		while(first.data != a) {
//			first = first.next;
//		}
//		while(second.data != b) {
//			second = second.next;
//		}
//		
//		second.next = first.next;
//		first.next = second.next;
//		//second.next = first.next;
//	}
	
	// To print the linked list
	public void printLL(Node l) {
		Node t = l;
		while(t!= null) {
			System.out.print(t.data+" ");
			t = t.next;
		}
	}
	
}


