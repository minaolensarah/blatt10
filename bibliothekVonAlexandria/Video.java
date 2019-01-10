package bibliothekVonAlexandria;

class Video extends Multimedia {
	public Video(int length1, String title1, String genre1) {
		super(title1, length1);
		genre = genre1;
	}

	private final String genre;
	
	/**
	 * Das Genre des Videos wird abgefragt
	 * 
	 * @return sprecherCopy
	 * @requires Video ist initialisiert
	 */
	String getGenre() {
		String genreCopy = genre;
		return genreCopy;
	}
}
