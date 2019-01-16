package autoaufgabe;

/**
 * Der Hersteller der Autos. Die firma hat einen Namen, der Ausgelesen werden kann.
 * 
 * @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 */
class Producer {
	private final String name;

	Producer(String name) {
		this.name = name;
	}

	/**
	 * Der Name dee Firma wird ausgelesen
	 * 
	 * @return name
	 */
	String getName() {
		final String nameCopy = name;
		return nameCopy;
	}

}
