/*import java.util.ArrayList;						// hier ben ik nog een beetje mee aan het spelen
													// tijdens het studeren kwam ik erachter, dat ik een veel gestroomlijndere versie kan maken.
public class BeslastingInspecteur{					// voorkeur gaat nu even naar het OCA
	double betaaldeBelasting;						// ik zal volgend weekend nog verder gaan
	Attractie[]belastingCheck;
	
	BelastingInspecteur(Attractie[] a){
		belastingCheck = a;
	}
	
	double kansSpelBelastingBetalen(Attractie i){
		double belasting = i.omzet * 0.3;
		return belasting;
	}
	
	public double belastingInnen(Attractie[] k) {
			for(Attractie i: k) {
				
				if(i.getClass()) {							//hier een toets of de interface vvan toepassing is op de atttractie in de kermis
					return kansSpelBelastingBetalen(i);
				}else
					return 0.0;
				}
			}
	

	/*double getTotaleOmzet() {
		double totaleOmzet= 0.00;
		for(Attractie lokaal: onzeKassa) {
			totaleOmzet += lokaal.getOmzet();
		}
		return totaleOmzet;
	}*/
