package autoaufgabe;

/**
 * Das Auto M6 vom Hersteller SMW.
 * 
 * @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 */
class M6 extends Vehicle {

	static private SMW hersteller = new SMW();
	
	M6(String farbe, double effkoeff, Engine motor){
		
		super(farbe, effkoeff, motor, hersteller);
	}
}
