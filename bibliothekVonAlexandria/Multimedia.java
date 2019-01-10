package bibliothekVonAlexandria;

/**
 * Ein Multimedium hat einen Titel, eine Spieldauer und es ist entweder entliehen oder nicht. Dieser Status kann verändert werden, dabei wird gespeichert von wem und bis wann das Medium entliehen wurde.
 * Es ist entweder ein Film oder ein Podcast.
 *
 * @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 *
 */
public class Multimedia extends Medien {
	private final int length;
	
	public Multimedia(final String title1, final int length1) {
		super(title1);
		length = length1;
	}
	
	/**
	 * Die Länge des Mediums wird abgefragt
	 * 
	 * Die Speildauer wird zurückgegeben
	 * 
	 * @return lengthCopy, Spieldauer des Mediums
	 */
	@Override
	int getLength() {
		int lengthCopy = length;
		return lengthCopy;
	}

}