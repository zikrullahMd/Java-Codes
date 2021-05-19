package AA_Problem;
import java.util.*;
public class Time_In_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		HashMap<Integer,String> hourMap = new HashMap<>();
		hourMap.put(1, "one");
		hourMap.put(2, "two");
		hourMap.put(3, "three");
		hourMap.put(4, "four");
		hourMap.put(5, "five");
		hourMap.put(6, "six");
		hourMap.put(7, "seven");
		hourMap.put(8, "eight");
		hourMap.put(9, "nine");
		hourMap.put(10, "ten");
		hourMap.put(11, "eleven");
		hourMap.put(12, "twelve");
		String x = hourMap.get(h);
		switch(m) {
		case 00: System.out.println(x+" o' clock");
		break;
		case 01: System.out.println("one minute past "+x);
		break;
		case 10: System.out.println("ten minutes past "+x);
		break;
		case 15: System.out.println("quarter past "+x);
		break;
		case 30: System.out.println("half past "+x);
		break;
		case 40: System.out.println("twenty minutes to six "+hourMap.getOrDefault(h+1,""));
		break;
		case 45: System.out.println("quarter to "+hourMap.getOrDefault(h+1,""));
		break;
		case 47: System.out.println("thirteen minutes to "+hourMap.getOrDefault(h+1,""));
		break;
		case 28: System.out.println("twenty eight minutes past "+x);
		break;
		case 29: System.out.println("twenty nine minutes past "+x);
		break;
		case 35: System.out.println("twenty five minutes to "+hourMap.get(h+1));
		break;
		case 57: System.out.println("three minutes to "+hourMap.get(h+1));
		break;
		default:System.err.println("error");
		break;
		}
	}

}
