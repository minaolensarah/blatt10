package bibliothekVonAlexandria;

/**
 * Ein Mitarbeiter hat einen Namen, einen Titel und keine maximale Ausleihdauer, man kann den Namen und den Titel abfragen. Mitarbeiter können Medien entleihen und zurückgeben. 
 * 
 * @author Sarah Breckner 
 * @author Kim Lingemann
 *
 */
class Mitarbeiter extends Person {
	private String titel;
	
	
	public Mitarbeiter(String name1, String titel1) {
		super(name1);
		titel=titel1;
	}
	

	/**
	  * Der Titel des Mitarbeiters wird abgefragt
	  * 
	  * @return titel, titel des Mitarbeiters
	  */
	public String getTitel() {
		return titel;
	}
	
	/**
	  * Der Titel des Mitarbeiters wird festgelegt
	  * 
	  * @param titel, titel des Mitarbeiters
	  */
	public void setTitel(final String titel2) {
		titel = titel2;
	}
	

	/**
	 * Ein Medium wird entliehen, falls es verfügbar ist
	 * 
	 * Der Status des Mediums wird zu entliehen geändert und der Benutzer als Entleiher gespeichert, wenn es nicht verfügbar ist, wird "Leider ist das Medium schon verliehen" ausgegeben, das Rückgabedatum wird auf "unbekannt" gesetzt
	 * 
	 * @param sameMedium, Medium, das entliehen wird
	 */
	@Override
	public void borrow(Medien medium) {
			this.commonBorrow(medium);
			medium.setBorrowedUntil("unbekannt");
	}

}
