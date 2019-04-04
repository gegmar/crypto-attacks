package powerfunction;

public class Powerfunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int mod = 1019;
		int expo = 111;
		int base = 123;
		int result = 1;
		
		for(int i= 0; i < expo; i++) {
			result *= base;
			result = result % mod;
		}
		
		System.out.println(result);
	}

}
