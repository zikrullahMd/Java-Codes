package Hash_Table_Implementation;
import java.util.*;
class HashTable{
	static int[] table;
	static int[] count;
	static char[] status;
	static int size = 0;
	static int n = 0;
	public HashTable(int n) {
		this.n= n;
		table = new int[n];
		count = new int[n];
		status = new char[n];
		Arrays.fill(status,'e');
	}
	HashTable map;
	static int getHashValue(int n, int s) {
		int i = 0;
		int hv = (n + i) % s;
		while(status[hv] == 'o') {
			i++;
			hv = (n + i) % s;
		}
		return hv;
	}
	
	public static int Contains(int e) {
		for(int i = 0;i<n;i++) {
			if(table[i] == e) {
				return i;
			}
		}
		return -1;
	}
	
	public static void put(int e) {
		int hv = getHashValue(e,n);
		int idx = Contains(e);
		if(idx != -1) {
			count[idx]++;
		}else {
			table[hv] = e;
			count[hv]++;
			status[hv] = 'o';
			size++;
		}
		
	}
	public static void delete(int e) {
		int idx = Contains(e);
		if(Contains(e) == -1) {
			System.out.println("element do not exists");
			return;
		}
		int hv = getHashValue(e,n);
		if(count[idx] == 1) {
			table[hv] = 0;
			status[hv] = 'd';
			size--;
			count[idx]--;
		}else {
			count[idx]--;
		}
		
	}
	public static void print() {
		for(int i = 0;i<n;i++) {
			System.out.println(table[i]);
		}
		//System.out.println();
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashTable map = new HashTable(n);
		for(int i = 1;i<=n;i++) {
			int e = in.nextInt();
			map.put(e);
		}
		map.print();
	}
}

