package autoaufgabe;

/**
 * Der Motor der Autos, is entweder Benziner oder nicht. Auﬂerdem kann die momentame Drezahl abgefragt und festgelegt werden.
 * Der Verbrauch und das Auto in dem der Motor verbaut ist kˆnnen abgefragt werden.
 * 
 * @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 */
class Engine {
	final private boolean isBenzin;
	private Vehicle verbautIn;
	private int drehzahl;
	private int verbrauch;

	
	/**
	 * Der momentane Verbrauch wird abgefragt
	 * 
	 * @return the verbauch
	 */
	int getVerbrauch() {
		int verbrauchCopy = verbrauch;
		return verbrauchCopy;
	}


	/**
	 * Das Auto, in dem der Motor verbaut ist wird abgefragt
	 * 
	 * @return the verbautIn
	 */
	Vehicle getVerbautIn() {
		return verbautIn;
	}

	/**
	 * Der Motor wird eingebaut
	 * 
	 * @param verbautIn the verbautIn to set
	 */
	void setVerbautIn(Vehicle verbautIn) {
		this.verbautIn = verbautIn;
	}

	Engine(boolean isBenzin) {
		this.isBenzin = isBenzin;
	}

	/**
	 * Ausgabe, ob der Motor ein Benziner ist
	 * @return true, ist Benziner
	 * @return false, ist diesel
	 */
	boolean isBenzin() {
		final boolean isBenzinCopy = isBenzin;
		return isBenzinCopy;
	}
	
	/**
	 * Die momentane Drehzahl wird abgefragt
	 * 
	 * @return drehzahl
	 */
	int getDrehzahl() {
		return drehzahl;
	}
	
	/**
	 * Der momentane Ausstoﬂ wird anhand der momentanen Drehzahl und dem Effizienzkoeffizienten berechnet
	 * 
	 * @return momentanen Ausstoﬂ
	 */
	double berechneAusstoﬂ() {
		double effkoeff = verbautIn.getEffkoeff();
		int aktuelleDrehzahl = this.getDrehzahl();
		
		return (aktuelleDrehzahl * effkoeff);
		
	}


	/**
	 * Momentane Drehzahl wird festgelegt
	 * 
	 * @param drehzahl the drehzahl to set
	 */
	void setDrehzahl(int drehzahl) {
		this.drehzahl = drehzahl;
	}
}
