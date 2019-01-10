package bibliothekVonAlexandria;

public class Podcast extends Printmedium {
	
	public Podcast(final int pages1, final String title1, final String sprecher1) {
		super(pages1, title1);
		sprecher = sprecher1;
	}

	private String sprecher;

	/**
	 * Der Sprecher des Podcasts wird abgefragt
	 * 
	 * @return sprecherCopy
	 * @requires Podacst ist initialisiert
	 */
	String getSprecher() {
		String sprecherCopy = sprecher;
		return sprecherCopy;
	}

	
}
