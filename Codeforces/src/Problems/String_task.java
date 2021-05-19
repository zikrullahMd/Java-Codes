package Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_task {	
	public static void main(String[] args) throws IOException{
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String ans = "";
		String v = "aoyeuiAOYEUI";
		
		String w = r.readLine();
		for(int i = 0; i < w.length(); i++){ 
			boolean m = false; //checking if a vowel
			for(int a = 0; a < v.length(); a++)
				if(w.charAt(i) == v.charAt(a)) 
					m = true;
			if(!m){ 
				ans +=".";
				if((int)w.charAt(i) <= 90 && (int)w.charAt(i) >= 65){
					ans += (char)(w.charAt(i) + 32);
				}
				else 
					ans += w.charAt(i);
			}		
		}
		System.out.println(ans); 
	}
}