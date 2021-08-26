package icc.be.poo;

public class Main {

	public static void main(String[] args) {
		Concert concert = new Concert ("Rap");

		Artiste artiste = new Artiste("Enjoy", false);
		Artiste artiste1 = new Artiste("mouMOU", true);
		Artiste artiste2 = new Artiste("moi", false);
		Artiste artiste3 = new Artiste("bingovip", true);
		Artiste artiste4 = new Artiste("bin", true);

		concert.getArtistes().add(artiste);
		concert.getArtistes().add(artiste1);
		concert.getArtistes().add(artiste2);
		concert.getArtistes().add(artiste3);
		concert.getArtistes().add(artiste4);
		
		MyUtilities.toXMLFile(concert,"data\\data.xml");
		;
	}
    
}
