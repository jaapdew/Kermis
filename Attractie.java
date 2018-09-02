
public class Attractie {
	String naam;
	double prijs;
	int count;
	double omzet;
	static int totaleCount;
	
	void draaien(){
		System.out.println("De attractie " + naam +  " draait");
		count++;
		totaleCount++;
		omzet = count * prijs;
	}
	double getOmzet() {
		return omzet;
	}
}
