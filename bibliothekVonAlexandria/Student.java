package bibliothekVonAlexandria;

import java.time.LocalDate;


/**
 * Ein Student hat einen Namen, eine Matrikelnummer und eine maximale Ausleihdauer, 
 * man kann den Namen und die Matrikelnummer abfragen. Studenten können Medien entleihen und zurückgeben. 
 * 
 *  @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 */
public class Student extends Person {
		
		final private int ausleihdauer = 90;
		private final int matrikelnummer;
		
		public Student(String name1, int matrikelnummer1) {
			super(name1);
			matrikelnummer = matrikelnummer1;
		}
		
		/**
		  * Die Matrikelnummer des Studenten wird abgefragt
		  * 
		  * @return matrikelnummer, Matrikelnummer des Studenten
		  */
		public int getMatrikelnummer() {
			return matrikelnummer;
		}
		
		/**
		 * Ein Medium wird entliehen, falls es verfügbar ist
		 * 
		 * Der Status des Mediums wird zu entliehen geändert und der Benutzer als Entleiher gespeichert, 
		 * wenn es nicht verfügbar ist, wird "Leider ist das Medium schon verliehen" ausgegeben, 
		 * das Rückgabedatum wird auf 3 Monate nach dem aktuellen Datum gesetzt
		 * 
		 * @param sameMedium, Medium, das entliehen wird
		 */
		@Override
		public void borrow(Medien medium ) {
			this.commonBorrow(medium);
			String expiryDate = LocalDate.now().plusDays(ausleihdauer).toString();
			medium.setBorrowedUntil(expiryDate);
		}
}