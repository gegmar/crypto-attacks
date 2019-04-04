package babyStepGiantStepAlgo;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * g^x = a mod p
		 * x = ?
		 */
		int g = 19; //siehe oben
		int a = 34;
		int p = 1237;
		int result = 1;
		int m = 36; // = |squr(Ordnung(p))| + 1
		int [] resultTable = new int[m]; // Speicherarray für Lookup-Table
		for(int j=0; j < m; j++) {
			for(int i = j; i > 0; i--) {
				result = result*g % p;
			}
			System.out.println("g^"+ j + " = " + result);
			resultTable[j] = result;
			result = 1;
		}
		
		int q = 1003; // = g^(-m) = g^(Ordnung(p)-m) = 19^(1236-36) mod 1237
		for(int i = 0; i < 36; i++) {
			result = 1;
			for(int j = i; j > 0; j--) {
				result = result * q % p;
			}
			result = (result * a) % p;
			System.out.println("a*q^i = " + result);
			//LookupTable nach Ergebnis durchsuchen
			for(int k = 0; k < resultTable.length; k++) {
				if(result == resultTable[k]) {
					System.out.println("D.h., dass das gesuchte x = log" + g + " " + a +
							" = i*m + j = " + i + " * " + m + " + " + k + " = " + (i*m+k));
					System.exit(0);
				}
			}
		}
	}

}
