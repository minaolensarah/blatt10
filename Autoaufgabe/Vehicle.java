package autoaufgabe;

/**
 * Ein Fahrzeug hat eine Farbe, einen Effizientkoeffizienten, einen Hersteller und einen Motor. 
 * Diese Eigenschaften können abgefragt werden. Des weiteren können Verbrauch und CO" Ausstoß des eigenen Motors abgefragt werden.
 * 
 * @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 */
class Vehicle {
	private String farbe;
	private final double effkoeff;
	private final Producer hersteller;
	private Engine motor;
	
	
	Vehicle(String farbe, double effkoeff, Engine motor, Producer hersteller) {
		this.farbe = farbe;
		this.effkoeff = effkoeff;
		this.motor = motor;
		this.hersteller = hersteller;
		motor.setVerbautIn(this);
		
	}
	/**
	 * Der Verbaute Motor wird ausgelesen
	 * 
	 * @return motor, Motor des Fahrzeugs
	 */
	Engine getMotor() {
		Engine motorCopy = motor;
		return motorCopy;
	}
	/**
	 * Ein neuer Motor wird eingebaut
	 * 
	 * @param motor the motor to set
	 */
	void setMotor(Engine motor) {
		this.motor = motor;
	}
	/**
	 * Fahrzeughersteller wird ausgelesen
	 * 
	 * @return the hersteller
	 */
	Producer getHersteller() {
		Producer herstellerCopy = hersteller;
		return herstellerCopy;
	}
	/**
	 * Fahrzeugfarbe wird ausgelesen
	 * 
	 * @return the farbe
	 */
	String getFarbe() {
		return farbe;
	}
	/**
	 * Das Auto wird umlackiert
	 * 
	 * @param farbe the farbe to set
	 */
	void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	/**
	 * Effizienskoeffizient wird ausgelesen
	 * 
	 * @return the effkoeff
	 */
	double getEffkoeff() {
		double effkoeffCopy = effkoeff;
		return effkoeffCopy;
	}
	
	/**
	 * Verbrauch wird über den Motor ausgelesen
	 * 
	 * @return the effkoeff
	 */
	Integer getVerbrauch() {
		return motor.getVerbrauch();
	}
	
	/**
	 *CO2 Ausstoß wird über den Motor ausgelesen
	 * 
	 * @return the effkoeff
	 */
	Double getAusstoß() {
		return motor.berechneAusstoß();
	}

	/**
	 * Drehzahl wird über den Motor ausgelesen
	 * 
	 * @param drehzahl the drehzahl to set
	 */
	void setDrehzahl(int drehzahl) {
		motor.setDrehzahl(drehzahl);
}
}
