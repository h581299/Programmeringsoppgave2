package no.hvl.dat100;

public class OppgaveO1 {

	public static void main(String[] args) {
		// Oppsett av tabell
		int[] heltalTabell = {1, 3, 5, 9, 16};

		// Metode for oppgave a)
		System.out.println("Oppgave a).");
		skrivUt(heltalTabell);
		
		// Metode for oppgave b)
		String tilStrengVerdi = tilStreng(heltalTabell);
		System.out.println("Oppgave b). " + tilStrengVerdi);
		
		// Metode for oppgave c)
		int sum = summer(heltalTabell);
		System.out.println("Oppgave c). " + sum);
		
		// Tester alle metoden for oppgave c).
		System.out.println("for: " + summer(heltalTabell));
		System.out.println("while: " + summerWhile(heltalTabell));
		System.out.println("for: " + summerFor(heltalTabell));
		
		// Metode for oppgave d)
		
	}
	
	// a). Implementer ein metode som kan skrive ut en tabell med heltal. Du kan selv bestemme formatet.
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
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
	
	/* c.) Implementer ein metode som gitt en tabell av heltall som parameter 
	 * beregner summen av tallene som er lagret i tabellen.
	 */
	public static int summer (int[] tabell) {
		int sum = 0;

		for (int i = 0; i < tabell.length; i++) {
			sum = sum + tabell[i];
		}
				
		return sum;
	}
	
	public static int summerWhile (int[] tabell) {
		int i = 0;
		int sum = 0;
		
		while (i < tabell.length) {
			sum = sum + tabell[i];
			i++;
		}
		
		
		return sum;
	}
	
	public static int summerFor (int[] tabell) {
		int sum = 0;
		
		for (int i : tabell) {
			sum = sum + i;
		}
		
		return sum;
	}

}
