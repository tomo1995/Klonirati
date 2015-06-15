package Dvodimanzionalni;

import java.util.Scanner;

public class Prvii {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi duzinu niza: ");
		int n = in.nextInt();
		System.out.println("Unesi duzinu niza");
		int m = in.nextInt();
		int[][] matrix = napraviMatricu(n, m);
		printajMatricu(matrix);
		
		System.out.println();
		trueFalse(true, matrix);
		
	}
	private static void printajMatricu(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}
	public static int [] [] napraviMatricu(int n, int m){
		Scanner in = new Scanner(System.in);
		int [] [] matrica = new int [n] [m];
		for ( int i = 0; i < matrica.length; i++ ){
			for ( int j = 0; j < matrica[i].length; j++){
				
				matrica[i][j] = (int) (Math.random() * 6 + 5);
						
			}
		}return matrica;
			
		}
	public static void trueFalse(boolean b, int [][] matrix ){
		if(b == false){
			printajMatricu(matrix);
		}else{
			for(int i = matrix.length - 1; i >= 0; i--){
				for(int j = matrix[i].length - 1; j >= 0; j--){
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	
}
	

