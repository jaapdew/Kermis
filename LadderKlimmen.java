
public class LadderKlimmen extends Attractie implements GokAttractie{
	double kansSpelBelasting;
	
	LadderKlimmen(){
		naam = "Ladderklimmen";
		prijs = 5.00;
		count =0;		
	}	
	void draaien(){
		System.out.println("De attractie " + naam +  " draait");
		count++;
		totaleCount++;
		omzet = count * prijs;
		kansSpelBelasting = kansSpelBelastingBetalen();
		System.out.println("Totale belasting is: "+ kansSpelBelasting);
	}
	public double kansSpelBelastingBetalen(){
		double belasting = omzet * 0.3;
		return belasting;
	}
	
}
