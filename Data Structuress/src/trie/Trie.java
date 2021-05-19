package trie;
import java.util.*;
public class Trie {
	
	static TrieNode root;
	
	public Trie(char c) {
		root = new TrieNode(c);
	}
		
	public void add(char c) {
		if(root == null) {
			root = new TrieNode(c);
		}
		TrieNode node = root;
		
	}
	public static void main(String[] args) {
		System.out.println('z'-'a');
	}

}


class TrieNode{
	char val;
	TrieNode[] child;
	boolean isWord;
	
	public TrieNode(char c) {
		val = c;
		child = new TrieNode[26];
		isWord = false;
	}
}