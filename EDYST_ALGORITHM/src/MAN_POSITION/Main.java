package MAN_POSITION;
import java.util.*;
public class Main {
	
	/*
	 * if(i%5==1):
        rl+=10
       elif(i%5==2):
        ll+=20
       elif(i%5==3):
        rl-=30
       elif(i%5==4):
        ll-=40
       elif(i%5==0):
        rl+=50
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = 0;
		int y = 0;
		for(int i = 1;i<=n;i++) {
			if(i % 5 == 1) {
				x += 10;
			}else if(i % 5 == 2) {
				y += 20;
			}else if(i % 5 == 3) {
				x -= 30;
			}else if(i % 5 == 4) {
				y -= 40;
			}else if(i % 5 == 0) {
				x += 50;
			}
		}
		System.out.println(x+" "+y);
	}

}
