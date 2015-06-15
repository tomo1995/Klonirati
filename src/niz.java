import java.util.Scanner;


public class niz {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		System.out.println("Input max 5 numbers, 0 for break");
		int [] brojevi = new int [5];
		
		for(int idx = 0; idx <= brojevi.length; idx++){
			int br = in.nextInt();
			if(br > 0) {
				brojevi[idx] = br;
			}else{
				break;
			}
		}
		int max = -1;
		for (int idx = 0 ; idx < brojevi.length; idx++){
			int elementNiza = brojevi[idx];
			if(brojevi [idx] > max){
				max = elementNiza;
			}
		}
		System.out.println("Najveci je " + max);

	}

}
