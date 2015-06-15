package Dvodimanzionalni;

import java.util.Scanner;

public class Matrica {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Unesi duzinu niza a ");
		int c = in.nextInt();
		System.out.println("Unesi duzinu niza b");
		int d = in.nextInt();
		
		int [] [] print = napraviMatricu(c, d);
		printMatrix(print);
		
		int [][] num = new int [3][3];
	
		for (int i = 0 ; i < num.length ; i++){
			for (int j = 0 ; j < num[i].length  ; j++){
				System.out.print(num[i][j] + " ");
				
			}
			System.out.println();
		}
			
		
	}
	public static void printMatrix ( int [][] matrica){
		int counter = 1;
		for (int i = 0; i < matrica.length; i++){
			for (int j = 0; j < matrica[i].length; j ++){
				System.out.print(matrica[i][j] + " ");

				matrica [i] [j] = counter++;
				}
			System.out.println();

		}
	}
	public static int[] [] napraviMatricu(int a, int b){
		Scanner in = new Scanner(System.in);
		int [][] matrica = new int [a] [b];
		for(int i = 0 ; i < matrica.length ; i++ ){
			for (int j = 0 ; j < matrica[i].length; j++){
				System.out.println("Unesi vrijednost na poziciji " + i + j);
				matrica [i][j] = in.nextInt();
			}
		}
		return matrica;
		
	}
}
