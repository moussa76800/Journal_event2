package icc.be.poo;

import java.time.LocalDate;

public class Evenement {

	private String texte;
	private LocalDate dateEvent;

	/**
	 * @param texte
	 * @param dateEvent
	 */
	public Evenement() {
		super();
	}

	/**
	 * @return the texte
	 */
	public String getTexte() {
		return texte;
	}

	/**
	 * @param texte the texte to set
	 */
	public void setTexte(String texte) {
		this.texte = texte;
	}

	/**
	 * @return the dateEvent
	 */
	public LocalDate getDateEvent() {
		return dateEvent;
	}

	/**
	 * @param dateEvent the dateEvent to set
	 */
	public void setDateEvent(LocalDate dateEvent) {
		this.dateEvent = dateEvent;
	}

	@Override
	public String toString() {
		return "Evenement [texte=" + texte + ", dateEvent=" + dateEvent + "]";
	}

}
