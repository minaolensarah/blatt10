package bibliothekVonAlexandria;

/**
 * Ein Printmedium hat einen Titel, eine Seitenzahl und es ist entweder entliehen oder nicht. 
 * Dieser Status kann verändert werden, dabei wird gespeichert von wem und bis wann das Medium entliehen wurde.
 * Es kann vom Typ Buch, Paper, Journal oder Zeitung sein.
 * 
 * @author Sarah Breckner 
 * @author Kim Lingemann
 *
 */
class Printmedium extends Medien {
	private final int pages;
	private final String typ;
	
	public Printmedium(final int pages1, final String title1, final String typ1) {
		super(title1);
		pages=pages1;
		typ = typ1;
	}
	/**
	  * Der Typ des Printmediums wird abgefragt
	  * 
	  * @return typ, Typ des Printmediums
	  * @requires Medium ist initialisiert 
	  */
	private String getTyp() {
		return typ;
	}
	
	/**
	 * Die Länge des Mediums wird abgefragt
	 * 
	 * Die Seitenzahl wird zurückgegeben
	 * 
	 * @return pages, Seitenzahl des Printmediums
	 */
	@Override
	public int getLenght() {
		return pages;
	}
	
}
