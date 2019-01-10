package bibliothekVonAlexandria;

/**
 * Ein Medium hat einen Titel, es ist entweder entliehen oder nicht. Dieser Status kann verändert werden, dabei wird gespeichert von wem und bis wann das Medium entliehen wurde.
 * 
 *  @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 *
 */
public abstract class Medien {
	private final String title;
	private String borrowedBy;
	private String borrowedUntil;
	private boolean available;
	
	public Medien(final String title1) {
		title = title1;
		available = true;
	}
	
	/**
	 * Die Länge des Mediums wird abgefragt
	 * 
	 * Hier soll entweder die Seitenzahl oder die Spieldauer zurückgegeben werden
	 */
	abstract int getLength();
	
	/**
	  * Der Titel des Mediums wird abgefragt
	  * 
	  * @return titleCopy, Titel des Mediums
	  * @requires Medium ist initialisiert 
	  */
	public String getTitle() {
		String titleCopy = title;
		return titleCopy;
	}
	
	/**
	  * Der Entleiher des Mediums wird abgefragt
	  * 
	  * Wenn es entliehen ist, wird der Entleiher zurückgegeben, wenn nicht wird "niemand" zurückgegeben
	  * 
	  * @return borrowedByCopy, Entleiher des Mediums
	  * @requires Medium ist initialisiert 
	  */
	public String getBorrowedBy() {
		String borrowedByCopy = borrowedBy;
		return borrowedByCopy;	}
	
	/**
	  * Das späteste Rückgabedatum des Mediums wird abgefragt
	  * 
	  * Wenn es entliehen ist, wird Das späteste Rückgabedatum zurückgegeben, wenn nicht wird "verfügbar" zurückgegeben
	  * 
	  * @return borrowedUntilCopy, Das späteste Rückgabedatum des Mediums
	  * @requires Medium ist initialisiert 
	  */
	public String getBorrowedUntil() {
		String borrowedUntilCopy = borrowedUntil;
		return borrowedUntilCopy;
	}
	
	/**
	 * Abfrage, ob das Medium ausleihbar ist
	 * 
	 * @return true, wenn ausleihbar
	 * @return false, wenn entliehen
	 */
	public boolean isItAvailable() {
		boolean availableCopy = available;
		return availableCopy;
	}
	
	/**
	  * Der Entleiher des Mediums wird festgelegt
	  * 
	  * Der Name des Entleihers wird abgespeichert
	  * 
	  * @param user, Entleiher des Mediums
	  * @requires Medium ist initialisiert 
	  * @ensures Der Entleiher des Mediums wird unter borrowedBy gespeichert
	  */
	void setBorrowedBy(String user) {
		borrowedBy = user;
	}
	
	/**
	  * Das späteste Rückgabedatum des Mediums wird festgelegt
	  * 
	  * @param date, Das späteste Rückgabedatum des Mediums
	  * @requires Medium ist initialisiert 
	  * @ensures Das späteste Rückgabedatum des Mediums wird unter borrowedUntil gespeichert
	  */
	void setBorrowedUntil(String date) {
		borrowedUntil = date;
	}
	
	/**
	 * Der Status des Mediums wird auf entliehen gesetzt
	 * 
	 * @ensures available = false
	 */
	void borrowed() {
		available = false;
	}
	
	/**
	 * Das Medium wird zurückgegeben
	 * 
	 * Der Status des Mediums wird auf verfügbar gesetzt, als Entleiher wird "niemand" und als Rückgabedatum "verfügbar" abgespeichert
	 * 
	 * @ensures available = true , borrowedBy = "niemand" , borrowedUntil = "verfügbar"
	 */
	void returned() {
		available = true;
		borrowedBy = "niemand";
		borrowedUntil = "verfügbar";
	}
}