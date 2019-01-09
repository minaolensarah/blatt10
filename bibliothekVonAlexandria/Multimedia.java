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
class Multimedia extends Medien {
	private final int length;
	private final boolean isPodcast;
	private boolean isInitialised=false;
	
	public Multimedia(final String title1, final int length1, final boolean podcast) {
		super(title1);
		length = length1;
		isPodcast = podcast;
		isInitialised = true;
	}
	
	/**
	 * Die Art des Mediums wird abgefragt
	 * 
	 * Die Art des Mediums wird zurückgegeben
	 * 
	 * @requires Medium ist initialisiert
	 * @return Podcast, für isPodcast = true
	 * @return Film, für isPodcast = false
	 */
	String getTyp() {
		assert(isInitialised);
		if(isPodcast) {
			return "Podcast";
		} else {
			return "Film";
		}
		
	}
	
	/**
	 * Die Länge des Mediums wird abgefragt
	 * 
	 * Die Speildauer wird zurückgegeben
	 * 
	 * @requires Medium ist initialisiert
	 * @return length, Speildauer des Mediums
	 */
	@Override
	int getLength() {
		assert(isInitialised);
		return length;
	}

}
