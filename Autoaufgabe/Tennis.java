package autoaufgabe;

/**
 * Das Auto Tennis vom Hersteller Informatik werke.
 * 
 * @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 */
class Tennis extends Vehicle {
	final static private InformatikWerke hersteller = new InformatikWerke();
	
	Tennis(String farbe, double effkoeff, Engine motor){
		
		super(farbe, effkoeff, motor, hersteller);
	
	}
}
