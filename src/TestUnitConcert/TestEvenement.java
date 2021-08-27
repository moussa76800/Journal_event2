package TestUnitConcert;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import icc.be.poo.Concert;
import icc.be.poo.DuplicateConcertException;
import icc.be.poo.Evenement;

class TestEvenement {

	@Test
	void testaddConcert() {
		Evenement even = new Evenement();
		Concert conc = new Concert("rnb");
		even.addConcert(conc);
		
		assertThrows(DuplicateConcertException.class,() ->{
			even.addConcert(conc);
		});
	}

}
