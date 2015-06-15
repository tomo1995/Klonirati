import java.util.Scanner;

public class Niz3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] num = new int[5];

		int counter = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.println("Unesi" + (i + 1) + ". broj niza");
			num[i] = in.nextInt();

		}
		System.out.println("Unesi broj");
		int br = in.nextInt();
		for (int i = 0; i < num.length; i++) {
			if (br == num[i]) {
				counter++;
			}
		
		}
		System.out.println("Ispisuje se " + counter);

		in.close();
	}
}
