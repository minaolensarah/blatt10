package bibliothekVonAlexandria;

/**
 * Ein Printmedium hat einen Titel, eine Seitenzahl und es ist entweder entliehen oder nicht. 
 * Dieser Status kann verändert werden, dabei wird gespeichert von wem und bis wann das Medium entliehen wurde.
 * 
 *  @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 */
public class Printmedium extends Medien {
	private final int pages;
	
	public Printmedium(final int pages1, final String title1) {
		super(title1);
		pages = pages1;		
	}
	
	/**
	 * Die Länge des Mediums wird abgefragt
	 * 
	 * Die Seitenzahl wird zurückgegeben
	 * 
	 * @return pagesCopy, Seitenzahl des Printmediums
	 */
	@Override
	public int getLength() {
		int pagesCopy = pages;
		return pagesCopy;
	}
	
}
