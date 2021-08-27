package icc.be.poo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// je cree un evenement 
		Evenement even = new Evenement();
		// je cree des concert
		Concert concert = new Concert ("Rap");
		Concert conct = new Concert ("rnb");
		Concert conce = new Concert ("pop");
		// je cree un liste de concert
		ArrayList<Concert> list = new ArrayList<>();
		// j'ajoute les concerts dans la liste
		list.add(concert);
		list.add(conct);
		list.add(conce);
		// j'ajoute la liste des concerts dans mon evenement
		even.setConcert(list);
		// j'ajoute " concert " avec la methode "addConcert()" qui se trouve
		// dans la classe evenement.
		even.addConcert(concert); 
		
		
		
//		Artiste artiste = new Artiste("Enjoy", false);
//		Artiste artiste1 = new Artiste("mouMOU", true);
//		Artiste artiste2 = new Artiste("moi", false);
//		Artiste artiste3 = new Artiste("bingovip", true);
//		Artiste artiste4 = new Artiste("bin", true);
//
//		concert.getArtistes().add(artiste);
//		concert.getArtistes().add(artiste1);
//		concert.getArtistes().add(artiste2);
//		concert.getArtistes().add(artiste3);
//		concert.getArtistes().add(artiste4);
//		
//		MyUtilities.toXMLFile(concert,"data\\data.xml");
		
	}
    
}
