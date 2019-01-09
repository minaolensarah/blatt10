package bibliothekVonAlexandria;

/**
 * Ein Medium hat einen Titel, es ist entweder entliehen oder nicht. Dieser Status kann ver�ndert werden, dabei wird gespeichert von wem und bis wann das Medium entliehen wurde.
 * 
 * @author Sarah Breckner 
 * @author Kim Lingemann
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
	 * Hier soll entweder die Seitenzahl oder die Speildauer zur�ckgegeben werden
	 */
	abstract int getLenght();
	
	/**
	  * Der Titel des Mediums wird abgefragt
	  * 
	  * @return title, Titel des Mediums
	  * @requires Medium ist initialisiert 
	  */
	public String getTitle() {
		return title;
	}
	
	/**
	  * Der Entleiher des Mediums wird abgefragt
	  * 
	  * Wenn es entliehen ist, wird der Entleiher zur�ckgegeben, wenn nicht wird "niemand" zur�ckgegeben
	  * 
	  * @return borrowedBy, Entleiher des Mediums
	  * @requires Medium ist initialisiert 
	  */
	public String getBorrowedBy() {
		return borrowedBy;
	}
	
	/**
	  * Das sp�teste R�ckgabedatum des Mediums wird abgefragt
	  * 
	  * Wenn es entliehen ist, wird Das sp�teste R�ckgabedatum zur�ckgegeben, wenn nicht wird "verf�gbar" zur�ckgegeben
	  * 
	  * @return borrowedBy, Das sp�teste R�ckgabedatum des Mediums
	  * @requires Medium ist initialisiert 
	  */
	public String getBorrowedUntil() {
		return borrowedUntil;
	}
	
	/**
	 * Abfrage, ob das Medium ausleihbar ist
	 * 
	 * @return true, wenn ausleihbar
	 * @return false, wenn entliehen
	 */
	public boolean isItAvailable() {
		return available;
	}
	
	/**
	  * Der Entleiher des Mediums wird festgelegt
	  * 
	  * Der Name des Entleihers wird abgespeichert
	  * 
	  * @param user, Entleiher des Mediums
	  * @requires Medium ist initialisiert 
	  */
	void setBorrowedBy(String user) {
		borrowedBy = user;
	}
	
	/**
	  * Das sp�teste R�ckgabedatum des Mediums wird festgelegt
	  * 
	  * @param date, Das sp�teste R�ckgabedatum des Mediums
	  * @requires Medium ist initialisiert 
	  */
	void setBorrowedUntil(String date) {
		borrowedUntil = date;
	}
	
	/**
	 * Der Status des Mediums wird auf entliehen gesetzt
	 */
	void borrowed() {
		available = false;
	}
	
	/**
	 * Der Status des Mediums wird auf verf�gbar gesetzt, als Entleiher wird "niemand" und als R�ckgabedatum "verf�gbar" abgespeichert
	 */
	void returned() {
		available = true;
		borrowedBy = "niemand";
		borrowedUntil = "verf�gbar";
	}
}
