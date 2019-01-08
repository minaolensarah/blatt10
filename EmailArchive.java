package immutable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Collection;

/**
 * Ein Email Archiv enthält eine Sammlung von Emails, aus der keine Emails gelöst oder veränder werden können. Es können Emails hinzugefügt werden. Desweiteren hat das Emailarchiv einen Namen und das Erstellungsdatum wird abgespeichert.
 * 
 * @author Sarah Breckner 
 * @author Kim Lingemann
 *
 */
public class EmailArchive {
	private final String erstellungsdatum;
	private final String name;
	private final List<Email> archive = new Collection();
	LocalDateTime datum;
	
	public EmailArchive(final String name1, final List<Email> archive1) {
		name = name1;
		archive = archive1;
		erstellungsdatum = datum.toLocalDate().toString();
		
	}
	
	/**
	  * Das Erstellungsdatum des Archivs wird abgefragt
	  * 
	  * @return erstellungsdatum, gibt an an welchem Tag in welchem Monat welches Jahres das Archiv initialisiert wurde
	  * @requires EmailArchive ist initialisiert 
	  */
	public String getErstellungsdatum() {
		
		return erstellungsdatum;
	}
	
	/**
	  * Der Name des Archivs wird abgefragt
	  * 
	  * @return name, Name des Archivs
	  * @requires Emailarchiv ist initialisiert 
	  */
	public String getName() {
		
		return name;
	}
	
	/**
	 * Eine Email wird zum Archiv hinzugefügt
	 * 
	 * @param mail, Email, die zum Archiv hinzugefügt werden soll
	 * @requires Archiv und Email existieren
	 * @ensures die Liste archive hat ein Element (mail) mehr
	 */
	public void addEMailToArchive(final Email mail) {
		archive.add(mail);
	}
}
