package Vjezbanje;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int counter = 0;
		int n = in.nextInt();
		for ( int i = n; i > 0; i/=10){
			counter++;
		}System.out.println("Uneseni broj ima " + counter + " cifre");
		
		
	}

}
