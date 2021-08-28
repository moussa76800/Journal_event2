/**
 * 
 */
package icc.be.poo;

import java.util.ArrayList;

/**
 * @author Moussa
 *
 */

public class Concert extends Evenement implements Manageable {

	private String designation;
	private ArrayList<Artiste> artistes;

	/**
	 * @param texte
	 * @param dateEvent
	 * @param designation
	 * @param artistes
	 */
	public Concert(String designation) {
		super();
		// donc ici je vais utilis� la methode setteur 
		setDesignation(designation);
		this.artistes = new ArrayList<>();
	}
	
	
	public void setDesignation(String designation) {
		// si designation n'est pas �gal a Hello , 
		// alors leve moi l'exception
		if(designation.equals("Hello")) {
			throw new VideDesignationException("\nVous avez introduit Hello dans la designation,\n Veuillez introduire une autre d�signation");
		}else {
			this.designation = designation;
		}
		
	}







	/**
	 * @param artistes the artistes to set
	 */
	public void setArtistes(ArrayList<Artiste> artistes) {
		
		this.artistes = artistes;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @return the artistes
	 */
	public ArrayList<Artiste> getArtistes() {
		return artistes;
	}

	

	@Override
	public boolean dropArtiste(Artiste a) {
		ArrayList<Artiste> list = getArtistes();
		if (list.contains(a)) {

			list.remove(a);
			return true;
		}

		return false;
	}

	@Override
	public boolean hadArtiste(Artiste a) throws DuplicateArtistException {

		ArrayList<Artiste> list = getArtistes();

		if (list.contains(a)) {
			throw new DuplicateArtistException("L'artiste est d�ja pr�sente dans la liste");
		} else {
			list.add(a);
			return true;
		}

	}

	public ArrayList<Artiste> getVIPS() {
		ArrayList<Artiste> list = new ArrayList<>();
		for (Artiste art : getArtistes()) {
			if (art.isVip()) {
				list.add(art);
			}
		}
		return list;

	}

	@Override
	public String toString() {
		return "Concert \n[designation=" + designation 
				+ ",\nartistes=" + artistes + "]\n ------------------------------- \n";
	}
}
