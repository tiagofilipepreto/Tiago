package pt.upacademy.exemplos;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class FizzBuzz {
	private int numCicles;
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		FizzBuzz myApp = new FizzBuzz();
		 myApp.Start();
};
	public void Start() {
		for (int i = 0; i < 40; i++) {
			System.out.print("numero "+i+":");
			if (i%5 ==0) {
				System.out.print("Buzz");
			}
			if (i%3==0) {
				System.out.print("Fizz");
			}
			System.out.println();
		}
		
	}
		
	}


