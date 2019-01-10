package bibliothekVonAlexandria;

import java.time.LocalDate;

/**
 * Ein Externer hat einen Namen, und eine maximale Ausleihdauer von 30 Tagen, 
 * man kann den Namen abfragen. Externe können Medien entleihen und zurückgeben. 
 * 
 *  @author	Sarah Breckner 
 *			3425446 
 *			st163632@stud.uni-stuttgart.de 
 * @author	Kim Lingemann
 *			3380756 
 *			st160814@stud.uni-stuttgart.de
 *
 *
 */
public class Extern extends Person {

		private final int ausleihdauer=30; 
		
		
		public Extern(String name1) {
			super(name1);
		}
		
		/**
		 * Ein Medium wird entliehen, falls es verfügbar ist
		 * 
		 * Der Status des Mediums wird zu entliehen geändert und der Benutzer als Entleiher gespeichert, 
		 * wenn es nicht verfügbar ist, wird "Leider ist das Medium schon verliehen" ausgegeben, 
		 * das Rückgabedatum wird auf 30 Tage nach dem aktuellen Datum gesetzt.
		 * 
		 * @param sameMedium, Medium, das entliehen wird
		 */
		@Override
		public void borrow(Medien medium) {
				this.commonBorrow(medium);
				String expiryDate = LocalDate.now().plusDays(ausleihdauer).toString();
				medium.setBorrowedUntil(expiryDate);
		}
	

}
