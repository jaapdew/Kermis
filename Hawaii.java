
public class Hawaii extends RisicoRijkeAttractie{
	Boolean risico = false;
	
	Hawaii(){
		naam = "Hawaii";
		prijs = 2.90;
		count =0;
		
	}	
	void draaien(){
		if(opstellingsKeuring()) {
			System.out.println("Hawaii kan niet draaien");
		}else {
			super.draaien();
		}
		/*System.out.println("De attractie " + naam +  " draait");
		count++;
		totaleCount++;
		omzet = count * prijs;
		}*/
	}
	boolean opstellingsKeuring() {
		if(count>9) {
			risico = true;
			System.out.println("Keuring vereist");
		}
			return risico;
	}
	
}
