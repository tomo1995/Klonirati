import java.util.Scanner;


public class nizovi2D {

	public static void main(String[] args) {
		int [][] array = new int [4][5];
		Scanner in = new Scanner (System.in);
		
		
		//		array [0][0] = 1;
//		array [0][1] = 2;
//		array [0][2] = 3;
//		array [0][3] = 4;
//		array [0][4] = 5;
//		array [1][0] = 6;
//		array [1][1] = 7;
//		array [1][2] = 8;
//		array [1][3] = 9;
//		array [1][4] = 10;
//		array [2][0] = 11;
//		array [2][1] = 12;
//		array [2][2] = 13;
//		array [2][3] = 14;
//		array [2][4] = 15;
//		array [3][0] = 16;
//		array [3][1] = 17;
//		array [3][2] = 18;
//		array [3][3] = 19;
//array [3][4] = 20;
		System.out.println("Unesi duzinu niza");
		int a = in.nextInt();
		System.out.println("Unesi duzinu niza");
		int b = in.nextInt();
		
		
		int [][] matrica = new int [a][b];
		for (int i = 0; i < matrica.length; i++){
			for (int j = 0; j < matrica[i].length; j++){
				System.out.print("Unesi element " + i + "," + j + ": ");
				matrica[i][j] = in.nextInt();
			}
		}
		
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + ", ");
			}
			System.out.println();
		}
		
		int counter = 1;
		for (int i = 0; i <array.length; i++){
			for ( int j = 0; j < array[i].length; j++){
				array[i][j] = counter ++;
			}
		}
		print2DArray(array);
		int[] ba =getColumn(matrica, 1);
		for (int i = 0; i < ba.length; i++){
			System.out.println(ba[i]);
		}
	}
	public static void print2DArray(int [] [] array){
		for ( int i = 0; i < array.length; i++){
			for ( int j = 0; j < array[i].length; j++){
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static int [] getColumn (int[][] matrica, int kolona){
		int [] niz = new int [matrica.length];
		for(int i = 0; i < matrica.length; i++){
			niz[i] = matrica [i][kolona];
		}
		return niz;
		
	}
}
