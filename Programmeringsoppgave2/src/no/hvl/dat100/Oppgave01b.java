package no.hvl.dat100;

public class Oppgave01b {

	public static void main(String[] args) {
		// Metode for oppgave b)
		int[] heltalTabell = {1, 3, 5, 9, 16};
		String tilStrengVerdi = tilStreng(heltalTabell);
		System.out.println("Oppgave b). " + tilStrengVerdi);

	}

	/* b.) Implementer ein metode som kan returnere en string med 
	 * innholdet av en tabell. For en tabell med elementene 42,67,89 
	 * skal følgende streng returneres: "[42,67,89]"
	 */
	public static String tilStreng (int[] tabell) {
		String resultat = "\"[";
		
		for (int i = 0; i < tabell.length; i++) {
			resultat = resultat + tabell[i];
		}
		
		return resultat + "]\"";
	}
}
