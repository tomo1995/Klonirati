
public class petak03 {
	public static void main(String[] args) {
		threeNPlusOne(99);
	}
		public static void threeNPlusOne (int n){
			int N = n;
			int count = 1;
			while (N > 1) {
				if  ( N % 2 == 1){
					N = 3 * N + 1;
				}else
					N /= 2;
				count ++;
				System.out.println(N);
		}System.out.println(" There were" + count + "terms in the sequence.");
	}		
	

}
