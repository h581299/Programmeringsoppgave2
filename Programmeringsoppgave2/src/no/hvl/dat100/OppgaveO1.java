package no.hvl.dat100;

public class OppgaveO1 {

	public static void main(String[] args) {
		// Oppsett av tabell
		int[] heltalTabell = {1, 3, 5, 9, 16};

		// Metode for oppgave a)
		System.out.println("Oppgave a)");
		skrivUt(heltalTabell);

		// Metode for oppgave b)
		System.out.println("Oppgave b)");
		String tilStrengVerdi = tilStreng(heltalTabell);
		System.out.println(tilStrengVerdi);

		// Metode for oppgave c)
		System.out.println("Oppgave c)");
		int sum = summer(heltalTabell);
		System.out.println(sum);

		// Tester alle metoden for oppgave c).
		System.out.println("for: " + summer(heltalTabell));
		System.out.println("while: " + summerWhile(heltalTabell));
		System.out.println("for: " + summerFor(heltalTabell));

		// Metode for oppgave d)
		System.out.println("Oppgave d)");
		boolean finnesTallet = finnesTall(heltalTabell, 5);
		System.out.println(finnesTallet);

		// Metode for oppgave e)
		System.out.println("Oppgave e)");
		int posisjon = posisjonTall(heltalTabell, 5);
		System.out.println(posisjon);

		// Metode for oppgave f)
		System.out.println("Oppgave f)");
		int[] reverseTabell = reverser(heltalTabell);
		skrivUt(reverseTabell);

		// Metode for oppgave g)
		System.out.println("Oppgave g)");
		boolean sortert = erSortert(heltalTabell);
		System.out.println(sortert);

		// Metode for oppgave h)
		System.out.println("Oppgave h)");
		int[] heltalTabell2 = {25, 30, 35, 40};
		int[] sammensattTabell = settSammen(heltalTabell, heltalTabell2);
		skrivUt(sammensattTabell);
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

	// Oppgave c.) med while løkke løsning.
	public static int summerWhile (int[] tabell) {
		int i = 0;
		int sum = 0;
		
		while (i < tabell.length) {
			sum = sum + tabell[i];
			i++;
		}
		
		
		return sum;
	}

	// Oppgave c.) med utvidet for løkke løsning.
	public static int summerFor (int[] tabell) {
		int sum = 0;
		
		for (int i : tabell) {
			sum = sum + i;
		}
		
		return sum;
	}
	
	/* d) Implementer ein metode som gitt en tabell og et tall returnerer 
	 * true om tabellen tabell innholder tallet tall og false ellers.
	 */
	public static boolean finnesTall (int[] tabell, int tall) {
		boolean result = false;
		
		for (int i : tabell) {
			if (i == tall) {
				result = true;
			}
		}
		
		return result;
	}
	
	/* e) Implementer ein metode som returnerer det første index (posisjon) i 
	 * tabell som inneholder tallet tall og -1 ellers.
	 */
	public static int posisjonTall (int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}

		return -1;
	}
	
	/* f) Implementer ein metode som gitt en tabell av heltall returnerer en ny 
	 * tabell som har de samme elementene som tabell men i modsatt rekkefølge.
	 */
	public static int[] reverser(int[] tabell) {
		int[] nyTabell = new int[tabell.length];

		for (int i = tabell.length - 1, j = 0; 0 <= i; i--, j++) {
			nyTabell[j] = tabell[i];
		}
		
		return nyTabell;
	}
	
	/* g) Implementer ein metode som kan avgjere om ein array (tabell) av heiltal 
	 * er sortert stigande (dvs. at alle tal skal vere større enn det forrige)
	 */
	public static boolean erSortert (int[] tabell) {
		boolean result = true;

		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i - 1]) {
				result = false;
			}
		}

		return result;
	}
	
	/* h) Implementer ein metode som gitt to tabeller tabell1 og tabell2 som paramtere 
	 * returnerer en ny tabell som er sammensetning av de to tabeller.
	 */
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		int[] nyTabell = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		
		for (int i = 0, j = tabell1.length; i < tabell2.length; i++, j++) {
			nyTabell[j] = tabell2[i];
		}

		return nyTabell;
	}
}
