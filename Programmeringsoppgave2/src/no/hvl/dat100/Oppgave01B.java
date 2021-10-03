package no.hvl.dat100;

public class Oppgave01B {

	public static void main(String[] args) {
		int[][] matrise = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

		// Oppgave a)
		System.out.println("Oppgave a)");
		skrivUtv1(matrise);
		
		// Oppgave b)
		System.out.println("Oppgave b)");
		String matriseStreng = tilStreng(matrise);
		System.out.println(matriseStreng);

		// Oppgave c)
		System.out.println("Oppgave c)");
		int[][] skalerMatrise = skaler(5, matrise);
		skrivUtv1(skalerMatrise);
		
		// Oppgave d)
		System.out.println("Oppgave d)");
		int[][] matrise2 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		boolean matriseErLik = erLik(matrise, matrise2);
		System.out.println(matriseErLik);
	}
	
	/* a) Implementer ein metode som kan skrive ut en matrise. Prøv å bruk to 
	 * to (nøstede) utvidede for-løkker (se avsnitt 5.6 i boken for beskrivelse 
	 * av utvidet for-løkke).
	 */
	public static void skrivUtv1(int[][] matrise) {
		for (int[] i : matrise) {
			for (int j : i) {
				System.out.println(j);
			}
		}

	}
	
	/* b) Implementer ein metode som returnerer en streng-representation av en 
	 * matrise.
	 */
	public static String tilStreng(int[][] matrise) {
		String result = "";

		for (int[] i : matrise) {
			for (int j : i) {
				result = result + j + " ";
			}
			result = result + "\n";
		}		

		return result;
	}
	
	/* c) Implementer ein metode som returnerer en ny matrise der alle tall 
	 * i matrisen er multiplisert med parameteren tall. Metoden må først opprette 
	 * en matrise like stor som parameteren og så multiplisere alle elementer med tall.
	 */
	public static int[][] skaler(int tall, int[][] matrise) {		
		int[][] nyMatrise = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			nyMatrise[i] = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}

		return nyMatrise;
	}

	/* d) Implementer ein metode som avgjør om to matriser gitt ved parametrene 
	 * a og b er like.
	 */
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		boolean erLik = true;
		
		if (mat1.length != mat2.length) {
			erLik = false;
		}

		for (int i = 0; i < mat1.length; i++) {
			if (mat1[i].length != mat2[i].length) {
				erLik = false;
			}
			for (int j = 0; j < mat1[i].length; j++) {
				if (mat1[i][j] != mat2[i][j]) {
					erLik = false;
				}
			}
		}

		return erLik;
	}


}
