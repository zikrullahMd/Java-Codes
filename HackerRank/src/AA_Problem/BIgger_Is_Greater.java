package AA_Problem;
import java.util.*;
public class BIgger_Is_Greater {
	
	static String modifyString(int A[], String str,
            int K)
{

// Size of String
int N = str.length();

// Stores the count of indices
int count[] = new int[N + 1];

// Count the positions where
// reversals will begin
for(int i = 0; i < K; i++)
{
count[A[i]]++;
}

for(int i = 1; i <= N / 2; i++)
{

// Store the count of reversals
// beginning at position i
count[i] = count[i] + count[i - 1];

// Check if the count[i] is
// odd the swap the character
if ((count[i] & 1) > 0)
{
str = swap(str, i - 1, N - i);
}
}

// Return the updated String
return str;
}

//Swap char of a string
static String swap(String str, int i, int j) 
{ 
char ch[] = str.toCharArray(); 
char temp = ch[i]; 
ch[i] = ch[j]; 
ch[j] = temp; 
return String.valueOf(ch); 
}
	
	static String Swap(String s, int n,int k, int l) {
		char[] a = s.toCharArray();
		char t = a[k];
		a[k] = a[l];
		a[l] = t;
		String ans = new String(a);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			StringBuilder s = new StringBuilder(in.next());
			int k = -1;
			for(int i = 0;i<s.length()-1;i++) {
				if((char) s.charAt(i) < s.charAt(i+1)) {
					k = i;
				}
			}
			if(k < 0) {
				System.out.println("no answer");
			}else {
				int l = 0;
				for(int i = k+1;i<s.length();i++) {
					if(s.charAt(k) < s.charAt(i)) {
						l = i;
					}
				}
				String swapped = Swap(s.toString(),s.length(),k,l);
				int[] ch = {k+1,s.length()};
				System.out.println(modifyString(ch, s.toString(), ch.length));
			}
			
			
		}
	}

}