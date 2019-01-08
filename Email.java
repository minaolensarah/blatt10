package immutable;
/**
 * Eine E-Mail hat einen Sender, Empfanger, Betreff und einen Nachrichtenteil. Diese Attribute können durch set Methoden verändert und durch get Methoden ausgelesen werden
 * 
 * @author Sarah Breckner 
 * @author Kim Lingemann
 *
 */
public class Email {
	private static String sender;
	private static String empfaenger;
	private static String betreff;
	private static String nachricht;
	private boolean emailInitialisiert = false;
	
	 public Email(final  String sender1, final  String empfaenger1, final  String betreff1, final  String nachricht1 ) {
		sender = sender1;
		empfaenger = empfaenger1;
		betreff = betreff1;
		nachricht = nachricht1;
		
		emailInitialisiert = true;
	}
	
	 /**
	  * Der Sender der Email wird abgefragt
	  * @return sender, Zeichenkette, sagt wer die Email abgeschickt hat
	  * @requires Email ist initialisiert 
	  */
	 public String getSender() {
		 assert(emailInitialisiert);
		 return sender;
	 }
	 
	 /**
	  * Der Empfänger der Email wird abgefragt
	  * @return empfaenger, Zeichenkette, sagt wer die Email erhalten hat
	  * @requires Email ist initialisiert 
	  */
	 public String getEmpfaenger() {
		 assert(emailInitialisiert);
		 return empfaenger;
	 }
	 
	 /**
	  * Der Betreff der Email wird abgefragt
	  * @return betreff, Thema der Email
	  * @requires Email ist initialisiert 
	  */
	 public String getBetreff() {
		 assert(emailInitialisiert);
		 return betreff;
	 }
	 
	 /**
	  * Der Inhalt der Email wird abgefragt
	  * @return nachricht, Textinhalt der Email
	  * @requires Email ist initialisiert 
	  */
	 public String getNachricht() {
		 assert(emailInitialisiert);
		 return nachricht;
	 }
	 
	 /**
	  * Der Sender der Email wird festgelegt
	  * @param sender2, wird als sender der Email abgespeichert
	  * @ensures sender2 wird als Absender der Email abgespeichert
	  */
	 public void setSender(final String sender2) {
		 sender = sender2;
	 }
	 
	 /**
	  * Der Empfänger der Email wird festgelegt
	  * @param empfaenger2, wird als Empfänger der Email abgespeichert
	  * @ensures empfaenger wird als Empfänger der Email abgespeichert
	  */
	 public void setEmpfaenger(final String empfaenger2) {
		 empfaenger = empfaenger2;
	 }
	 
	 /**
	  * Der Betreff der Email wird festgelegt
	  * @param betreff2, wird als Betreff der Email abgespeichert
	  * @ensures betreff2 wird als Betreff der Email abgespeichert
	  */
	 public void setBetreff(final String betreff2) {
		 betreff = betreff2;
	 }
	 
	 /**
	  * Der Inhalt der Email wird festgelegt
	  * @param nachricht2, wird als Inhalt der Email abgespeichert
	  * @ensures nachricht2 wird als Inhalt der Email abgespeichert
	  */
	 public void setNachricht(final String nachricht2) {
		 nachricht = nachricht2;
	 }
}
