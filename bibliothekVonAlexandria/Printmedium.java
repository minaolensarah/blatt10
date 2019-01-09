package bibliothekVonAlexandria;

/**
 * Ein Printmedium hat einen Titel, eine Seitenzahl und es ist entweder entliehen oder nicht. Dieser Status kann ver�ndert werden, dabei wird gespeichert von wem und bis wann das Medium entliehen wurde.
 * 
 * @author Sarah Breckner 
 * @author Kim Lingemann
 *
 */
public class Printmedium extends Medien {
	private final int pages;
	
	public Printmedium(final int pages1, final String title1) {
		super(title1);
		pages=pages1;		
	}
	
	/**
	 * Die L�nge des Mediums wird abgefragt
	 * 
	 * Die Seitenzahl wird zur�ckgegeben
	 * 
	 * @return pages, Seitenzahl des Printmediums
	 */
	@Override
	public int getLenght() {
		return pages;
	}
	
}
