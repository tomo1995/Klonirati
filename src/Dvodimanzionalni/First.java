package Dvodimanzionalni;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi duzinu niza");
		int x = in.nextInt();
		System.out.println("Unesi duzinu niza");
		int y = in.nextInt();	
		int [] [] mat1 = napraviMatricu(x, y);
		prinajMatricu(mat1);
//		
//		int[][] array = new int [3][3]; 
//		int counter = 1;
//		for (int i = 0; i < array.length; i++){
//			for(int j = 0; j < array[i].length; j++){
//				System.out.print(array[i][j]+ " ");
//				array[i][j] = counter ++;
//
//			}
//			System.out.println();
//			}
	}
	
	public static void prinajMatricu(int [][] matrica){
		for (int i = 0; i < matrica.length; i++){
			for(int j = 0; j < matrica[i].length; j++){
				System.out.print(matrica[i][j]+ " ");
			}
			System.out.println();
	}
	}
	public static int [] [] napraviMatricu(int a, int b){
		Scanner in = new Scanner(System.in);
		int [] [] matrica = new int [a] [b];
		for ( int i = 0; i < matrica.length; i++ ){
			for ( int j = 0; j < matrica[i].length; j++){
				System.out.printf("Unesi vrijednost na poziciji [%d][%d]: ", i, j);
				matrica[i][j] = in.nextInt();
						
			}
		}
		return matrica;
		
	} 
}
