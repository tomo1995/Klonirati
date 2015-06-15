import java.util.Arrays;
import java.util.Scanner;


public class Niy2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesi duzinu niza");
		
		int [] length = new int [5];
		
		for ( int i =0; i <= length.length - 1; i++){
			int br = in.nextInt();
			if ( br > 0){
				length[i] = br;
			}else{
				break;
			}
			System.out.println(Arrays.toString(length));
		}
	}

}
