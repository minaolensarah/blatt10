package autoaufgabe;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Stack;

/**
 * Dem Teststand können Autos zugewiesen werden. Für den Test legt er zufällige Drehzahlen fest.
 * 
 * @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 */
class Teststand {
	private Vehicle testAuto;
	
	Teststand (Vehicle testAuto ) {
		this.testAuto = testAuto;
	}
	
	/**
	 * Welches Auto steht im Teststand?
	 * 
	 * @return the testAuto
	 */
	Vehicle getTestAuto() {
		Vehicle testAutoCopy= testAuto;
		return testAutoCopy;
	}

	/**
	 * Weise dem Teststand ein Auto zu
	 * 
	 * @param testAuto the testAuto to set
	 */
	void setTestAuto(Vehicle testAuto) {
		this.testAuto = testAuto;
	}

	/**
	 * Wähle zufällig sechs Drehzahlen für den Test
	 * 
	 * @return testverfahren , Stack der Zufallswerte
	 */
	Stack<Integer> testverfahren( ) {
		final Stack<Integer> testwerte = new Stack<Integer>();
		for(int i = 0; i<= 5; i++) {
			int randomDrehzahl = ThreadLocalRandom.current().nextInt(600, 5500);
			testwerte.add(randomDrehzahl);
		}
		return testwerte;
		
	}
}
