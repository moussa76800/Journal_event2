/**
 * 
 */
package icc.be.poo;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Moussa
 *
 */
public class Artiste implements Comparable<Artiste> {
	
	private String nomArtiste;
	private LocalDate dateCreation;
	private boolean isVip;

	/**
	 * @param nomArtiste
	 * @param dateCreation
	 * @param isVip
	 */
	public Artiste(String nomArtiste, boolean isVip) {
		super();
		
		setNomArtiste(nomArtiste);
		this.dateCreation = LocalDate.now();
		this.isVip = isVip;
	}

	/**
	 * @param nomArtiste the nomArtiste to set
	 */
	public void setNomArtiste(String nomArtiste) {
		Scanner sc = new Scanner(System.in);
		while(nomArtiste.equals("")){
			System.out.print("introduire a nouveau le nom : \n");
			nomArtiste = sc.nextLine();
			//throw new VideDesignationException("\n Error !!!\n Introduiser un nom correct !");
		}
		this.nomArtiste = nomArtiste;
	}

	/**
	 * @return the nomArtiste
	 */
	public String getNomArtiste() {
		return nomArtiste;
	}



	



	/**
	 * @return the dateCreation
	 */
	public LocalDate getDateCreation() {
		return dateCreation;
	}



	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}



	/**
	 * @return the isVip
	 */
	public boolean isVip() {
		return isVip;
	}



	/**
	 * @param isVip the isVip to set
	 */
	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}

 

	@Override
	public String toString() {
		return "\nArtiste [nomArtiste=" + nomArtiste + "\ndateCreation=" + dateCreation + "\nisVip=" + isVip + "\n]";
	}



	@Override
	public int compareTo(Artiste o) {
	
		return o.getNomArtiste().compareTo(getNomArtiste());
	}



	

}
