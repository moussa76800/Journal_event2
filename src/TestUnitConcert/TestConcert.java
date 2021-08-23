/**
 * 
 */
package TestUnitConcert;

import icc.be.poo.*;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * @author Moussa
 *
 */
class TestConcert {

	@Test
	void testConcert() {
		// Preparation

		ArrayList<Artiste> list = new ArrayList<>();
		Artiste artiste = new Artiste("mouliou", false);
		Artiste artiste1 = new Artiste("mouMOU", true);

		list.add(artiste);
		list.add(artiste1);

		// Utilisation

		LocalDate date = LocalDate.of(2021, 8, 21);
		Concert concert = new Concert("festival de Paname", date, "rnb");
		concert.getArtistes().add(artiste);
		concert.getArtistes().add(artiste1);

		// Verification Success

		assertEquals(list, concert.getArtistes());
		assertEquals("mouliou", artiste.getNomArtiste());
		assertEquals(artiste1.isVip(), true);
		assertEquals(LocalDate.now(), artiste.getDateCreation());

		// Verification Fail

		assertNotEquals(artiste.isVip(), true);

	}

	@Test
	public void TestMethodDropArtiste() {

		ArrayList<Artiste> list = new ArrayList<>();
		Artiste artiste = new Artiste("mouliou", false);
		Artiste artiste1 = new Artiste("mouMOU", true);

		list.add(artiste);
		list.add(artiste1);

		// Utilisation

		LocalDate date = LocalDate.of(2021, 8, 21);
		Concert concert = new Concert("festival de Paname", date, "rnb");

		concert.getArtistes().add(artiste);

		// Verificacation Success

		assertEquals(true, concert.dropArtiste(artiste));

		// Verificacation False

		assertNotEquals(true, concert.dropArtiste(artiste1));

	}

	@Test
	public void TestMethodeHadArtiste() {

		ArrayList<Artiste> list = new ArrayList<>();
		Artiste artiste = new Artiste("mouliou", false);
		Artiste artiste1 = new Artiste("mouMOU", true);

		list.add(artiste);
		list.add(artiste1);

		// Utilisation

		LocalDate date = LocalDate.of(2021, 8, 21);
		Concert concert = new Concert("festival de Paname", date, "rnb");

		concert.getArtistes().add(artiste);

		// Verificacation Success

		assertEquals(true, concert.hadArtiste(artiste1));
		assertEquals(concert.getArtistes().size(), list.size());
	}

	@Test
	public void testDuplicateArtistException() {
		// PREPARATION

		ArrayList<Artiste> list = new ArrayList<>();

		Artiste artiste1 = new Artiste("etch", true);

		// UTILISATION

		LocalDate date = LocalDate.of(2021, 8, 21);
		Concert concert = new Concert("festival de Paname", date, "rnb");
		concert.getArtistes().add(artiste1);

		assertThrows(DuplicateArtistException.class, () -> {
			concert.hadArtiste(artiste1);
		});
	}

	@Test

	public void TestComparableNameArtiste() {

		// PREPARATION

		ArrayList<Artiste> list = new ArrayList<>();

		Artiste artiste1 = new Artiste("etch", true);
		Artiste artiste2 = new Artiste("etchebest", true);

		list.add(artiste1);
		list.add(artiste2);
		
		Collections.sort(list,Collections.reverseOrder());
		
		ArrayList<Artiste> listing = new ArrayList<>();

		listing.add(artiste1);
		listing.add(artiste2);
		
		assertEquals(list, listing);
	}

	public void TestgetVIPs() {

		// PREPARATION

		ArrayList<Artiste> list = new ArrayList<>();

		Artiste artiste = new Artiste("etchebest", false);
		Artiste artiste1 = new Artiste("etch", true);

		list.add(artiste1);
		list.add(artiste);

		// UTILISATION
		LocalDate date = LocalDate.of(2021, 8, 21);
		Concert concert = new Concert("festival de Paname", date, "rnb");
		concert.getArtistes().add(artiste1);
		concert.getArtistes().add(artiste);

		// verification Success

		assertEquals(concert.getVIPS(), artiste1.isVip());

		// Verification Fail

		assertNotEquals(concert.getVIPS(), artiste.isVip());

	}
}
