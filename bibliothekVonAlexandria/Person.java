package bibliothekVonAlexandria;

/**
 * Eine Person hat einen Namen und eine später zu bestimmende maximal Ausleihdauer, man kann den Namen abfragen. Personen können Medien entleihen und zurückgeben. 
 * 
 *  @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 */
public abstract class Person {
	private final String name;
	
	public Person(final String name1) {
		name = name1;
	}
	
	/**
	  * Der Name der Person wird abgefragt
	  * 
	  * @return nameCopy, Name des Benutzers
	  * @requires Medium ist initialisiert 
	  */
	private String getName() {
		String nameCopy = name;
		return nameCopy;
	}
	
	/**
	 * Ein Medium wird durch einen Benutzer entliehen, falls es verfügbar ist
	 * 
	 * Der Status des Mediums wird zu entliehen geändert und der Benutzer als Entleiher gespeichert, wenn es nicht verfügbar ist, wird "Leider ist das Medium schon verliehen" ausgegeben
	 * @param sameMedium, Medium, das entliehen wird
	 */
	void commonBorrow(Medien sameMedium) {
		if(sameMedium.isItAvailable()) {
			sameMedium.borrowed();
			sameMedium.setBorrowedBy(name);
		} else {
			System.out.println("Leider ist das Medium schon verliehen");
		}
		
	}
	
	//Implementierung in den Kindklassen entsprechend der maximalen Verleihdauer
	public abstract void borrow(Medien medium);
	
	/**
	 * Ein Medium wird durch einen Benutzer zurückgegeben
	 * 
	 * @see Methode returned() der Klasse Medien
	 * @param sameMedium, Medium, das zurückgegeben wird
	 */
	public void returnMedia(Medien ruckgabeMedium) {
		ruckgabeMedium.returned();
	}
	
}