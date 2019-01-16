package autoaufgabe;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Der Test kann co2Aussto� Tests von Autos durchf�hren.
 * 
 * @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 */
class Test {
	private Queue<Double> testErgebnisse = new LinkedList<Double>();
	
	/**
	 * co2 Test wird an einem Teststand ausgef�hrt und die Aussto�werte f�r zuf�lllige Drehzahlen gemessen.
	 * Bei TennisSmarts werden die Ergebnisse um 60% verringert
	 * 
	 * @param teststand, an dem der test ausgef�hrt wird
	 * @return testergebnisse, Queue, Liste der Testergebnisse
	 */
	Queue<Double> co2test (final Teststand teststand) {
		TennisSmart smart = new TennisSmart(null, 0, null);
			Vehicle auto = teststand.getTestAuto();
			Stack<Integer> werteuebergabe = teststand.testverfahren();
			while(werteuebergabe.size() != 0) {
				if(auto.getClass().equals(smart.getClass())) {
					auto.setDrehzahl( werteuebergabe.pop());
					testErgebnisse.add(auto.getAussto�() * (2/5));
				} else {
					auto.setDrehzahl( werteuebergabe.pop());
					testErgebnisse.add(auto.getAussto�());
				}
		}
		
		return testErgebnisse;
		
	}
	
	/**
	 * Ein Beispieltest wird durchgef�hrt f�r ein Auto mit effkoeff= 1.5 . Die Ergebnisse werden auf der Konsole ausgegeben.
	 */
	public void main() {
	
		Engine dieserMotor = new Engine(true);
		SMW smw = new SMW();
		Vehicle testAuto = new Vehicle("rot", 1.5 , dieserMotor, smw);
		Teststand teststand = new Teststand(testAuto);
		
		Queue<Double> ergebnisse = co2test(teststand);
		Stack<Integer> werteuebergabe = teststand.testverfahren();
		while(!ergebnisse.isEmpty()) {
			System.out.printf(	"Der Aussto� liegt bei" + ergebnisse.remove() + "f�r die Drehzahl" + werteuebergabe.pop());
		}
	}
}
