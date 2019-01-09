package bibliothekVonAlexandria;

/**
 * Ein Multimedium hat einen Titel, eine Spieldauer und es ist entweder entliehen oder nicht. Dieser Status kann ver�ndert werden, dabei wird gespeichert von wem und bis wann das Medium entliehen wurde.
 * 
 * @author Sarah Breckner 
 * @author Kim Lingemann
 *
 */
public class Multimedia extends Medien {
	private final int length;
	
	public Multimedia(final String title1, final int length1) {
		super(title1);
		length = length1;
	}
	
	/**
	 * Die L�nge des Mediums wird abgefragt
	 * 
	 * Die Speildauer wird zur�ckgegeben
	 * 
	 * @return length, Speildauer des Mediums
	 */
	@Override
	int getLenght() {
		return length;
	}

}
