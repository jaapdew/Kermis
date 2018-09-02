
public class Spin extends RisicoRijkeAttractie{
	Boolean risico = false;
	
	Spin(){
		naam = "Spin";
		prijs = 2.25;
		count =0;
	}	
	void draaien(){
		if(opstellingsKeuring()) {
			System.out.println("Hawaii kan niet draaien");
		}else {
		System.out.println("De attractie " + naam +  " draait");
		count++;
		totaleCount++;
		omzet = count * prijs;
		}
	}
	boolean opstellingsKeuring() {
		if(count>4) {
			risico = true;
			System.out.println("Keuring vereist");
		}
			return risico;
	}
}
