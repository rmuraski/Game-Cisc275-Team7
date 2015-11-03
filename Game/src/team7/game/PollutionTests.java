package team7.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class PollutionTests {

	@Test
	public void testIsFixing() {
		Pollution p = new Pollution();
		p.setFixing(true);
		assertEquals(true, p.isFixing);
	}

}
