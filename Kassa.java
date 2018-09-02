import java.util.ArrayList;

public class Kassa {
	Attractie[] onzeKassa;

	Kassa(Attractie[] a){
		onzeKassa = a;
	}
	
	double getTotaleOmzet() {
		double totaleOmzet= 0.00;
		for(Attractie lokaal: onzeKassa) {
			totaleOmzet += lokaal.getOmzet();
		}
		return totaleOmzet;
	}
		
	
}

