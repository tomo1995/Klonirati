import java.util.Arrays;
import java.util.Scanner;

public class niy3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] niz = new int[100];
		int counter = 0;
		int sum = 0;
		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int) (Math.random() * 10);

		}
		// System.out.println(Arrays.toString(niz));
		System.out.println("Unesi broj");
		int br = in.nextInt();

		for (int i = 0; i < niz.length; i++) {
			if (br == niz[i])
				counter++;
		}

		System.out.println("Ponavlja se " + counter);

		for (int i = 0; i < 10; i++) {
			sum += niz[i];

		}
		System.out.println(sum);
		int i = 0;
		for (int j = 0; j < niz.length; j++) {
			System.out.println(niz[j]);
		}
		
		
		
	}

}
