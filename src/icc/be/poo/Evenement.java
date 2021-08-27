package icc.be.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Evenement {

	private String texte;
	private LocalDate dateEvent;
	/*
	 * J'ai crée une List de concert
	 */
	private ArrayList<Concert> concert;

	/**
	 * @param texte
	 * @param dateEvent
	 */
	public Evenement() {
		super();
		/*
		 * j'ai instancier la list dans le constructeur
		 */
		this.concert = new ArrayList<>();
	}

	public ArrayList<Concert> getConcert() {
		return concert;
	}

	public void setConcert(ArrayList<Concert> concert) {
		this.concert = concert;
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
	
	
	/*
	 * j'ai cree une methode pour ajouter un concert.
	 * j'ai pas fait de methode pour supprime un concert
	 */
	public boolean addConcert(Concert conCert) {
		boolean result = false;
		if(this.concert.contains(conCert)) {
			throw new DuplicateConcertException("le Concert existe deja");
		}else {
			this.concert.add(conCert);
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "Evenement [texte=" + texte + ", dateEvent=" + dateEvent + "]";
	}

}
