import java.util.*;

public class Kermis {
	public static void main(String[] args) {
		Attractie kermis[] = new Attractie[6];
		Kassa kassa = new Kassa(kermis);
		attractiesIndelen(kermis);
		for(int i=0; i<15;i++) {
			String keuze = bediening();
			if(keuze.equalsIgnoreCase("k") || keuze.equalsIgnoreCase("o")) {
				kassaFunctie(keuze, kassa);
			}else{
				attractieBediening(kermis,keuze);
			}
		}
		System.out.println(kermis[0].totaleCount);
	}
static void introductie() {
	System.out.println("Welkom");
	System.out.println("Voor het bedienen van de kassa drukt 1,2,3,4,5 of 6 om een attractie te laten draaien.");
	System.out.println("Voor het opvragen van het aantal kaartjes kies 'k' (k)aartje voor het bekijken van de totale omzet kies 'o' (o)mzet");


}


static void attractiesIndelen(Attractie kermis[]) {
	kermis[0] = new BotsAutos();
	kermis[1] = new Spin();
	kermis[2] = new SpiegelPaleis();
	kermis[3] = new SpookHuis();
	kermis[4] = new Hawaii();
	kermis[5] = new LadderKlimmen();
}
static void attractieBediening(Attractie[] kermis, String a) {
	int input = Integer.parseInt(a);
	input = input -1;
	kermis[input].draaien();
}
static void kassaFunctie(String a, Kassa b) {
	if(a.equalsIgnoreCase("K")) {
		System.out.println("Het totaal aantal verkochte kaartjes is: " + Attractie.totaleCount);
	}else
		System.out.println("Het totaal aantal verkochte kaartjes is: " + b.getTotaleOmzet());
}
static String bediening() {
	Scanner input = new Scanner(System.in);
	System.out.println("Welke attractie moet gedraaid worden?");
    String keuze = "a";
	try {
        keuze = input.next();
    } catch (InputMismatchException e) {
        System.out.println("Foute input ");
        keuze = bediening();
    }
    if (!keuze.equalsIgnoreCase("o") && !keuze.equalsIgnoreCase("k") && !keuze.equalsIgnoreCase("1")&& !keuze.equalsIgnoreCase("2") && !keuze.equalsIgnoreCase("3")&& !keuze.equalsIgnoreCase("4") && !keuze.equalsIgnoreCase("5")&& !keuze.equalsIgnoreCase("6")) {
    	System.out.println("Verkeerde input.");
    	keuze = bediening();}
    return keuze;
}
}
