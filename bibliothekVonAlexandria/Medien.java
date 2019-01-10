package bibliothekVonAlexandria;

/**
 * Ein Medium hat einen Titel, es ist entweder entliehen oder nicht. Dieser Status kann ver�ndert werden, dabei wird gespeichert von wem und bis wann das Medium entliehen wurde.
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
	 * Die L�nge des Mediums wird abgefragt
	 * 
	 * Hier soll entweder die Seitenzahl oder die Spieldauer zur�ckgegeben werden
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
	  * Wenn es entliehen ist, wird der Entleiher zur�ckgegeben, wenn nicht wird "niemand" zur�ckgegeben
	  * 
	  * @return borrowedByCopy, Entleiher des Mediums
	  * @requires Medium ist initialisiert 
	  */
	public String getBorrowedBy() {
		String borrowedByCopy = borrowedBy;
		return borrowedByCopy;	}
	
	/**
	  * Das sp�teste R�ckgabedatum des Mediums wird abgefragt
	  * 
	  * Wenn es entliehen ist, wird Das sp�teste R�ckgabedatum zur�ckgegeben, wenn nicht wird "verf�gbar" zur�ckgegeben
	  * 
	  * @return borrowedUntilCopy, Das sp�teste R�ckgabedatum des Mediums
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
	  * Das sp�teste R�ckgabedatum des Mediums wird festgelegt
	  * 
	  * @param date, Das sp�teste R�ckgabedatum des Mediums
	  * @requires Medium ist initialisiert 
	  * @ensures Das sp�teste R�ckgabedatum des Mediums wird unter borrowedUntil gespeichert
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
	 * Das Medium wird zur�ckgegeben
	 * 
	 * Der Status des Mediums wird auf verf�gbar gesetzt, als Entleiher wird "niemand" und als R�ckgabedatum "verf�gbar" abgespeichert
	 * 
	 * @ensures available = true , borrowedBy = "niemand" , borrowedUntil = "verf�gbar"
	 */
	void returned() {
		available = true;
		borrowedBy = "niemand";
		borrowedUntil = "verf�gbar";
	}
}