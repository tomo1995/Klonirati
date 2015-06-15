
public class petak0303 {

	public static void main(String[] args) {
		System.out.println(threeNPlusOne(25));
	}
	public static String threeNPlusOne(int n){
		String str = n +  "";
		while ( n > 1 ) {
			 if ( n % 2 == 1){
				 n = 3 * n + 1;
				 str += ", "+n;
				 
			 }else {
				 n/=2;
				 str+= ", " + n;
				 
			 }
			 
		}
		return str;
	}
}
