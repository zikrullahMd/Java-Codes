package UserDefinedException;

import java.util.Stack;

public class AnimalName {
	
	public static void main(String[] args){
		try {
		Animal ram  = new Animal("ram",45);
		Animal seeta = new Animal("seeta",-65);
		System.out.println(ram);
		System.out.println(seeta);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
