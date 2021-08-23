package icc.be.poo;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		LocalDate date= LocalDate.of(2021,8,21);
		Concert concert = new Concert ("Festival",date, "Rap");
		
		ArrayList<Artiste> a = new ArrayList<>();
		

		Artiste artiste = new Artiste("Enjoy", false);
		Artiste artiste1 = new Artiste("mouMOU", true);
		Artiste artiste2 = new Artiste("moi", false);
		Artiste artiste3 = new Artiste("bingovip", true);
		Artiste artiste4 = new Artiste("bin", true);

		concert.getArtistes().add(artiste);
		concert.getArtistes().add(artiste1);
		concert.getArtistes().add(artiste2);
		concert.getArtistes().add(artiste3);

		/*System.out.println(concert.getArtistes());
		
		System.out.println("=================================================================");
        
		System.out.println(concert.hadArtiste(artiste4));
		
		System.out.println(concert.getArtistes());*/
		
		MyUtilities.toXMLFile(concert,"data\\data.xml");
		;
	}
    
}
