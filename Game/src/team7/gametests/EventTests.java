package team7.gametests;

import static org.junit.Assert.*;

import org.junit.Test;
import team7.game.EventStub;

public class EventTests {

	@Test
	public void testResolveEvent() {
		EventStub e = new EventStub();
		e.resolveEvent();
		assertEquals(0, e.getDmgPerSecond());
		assertEquals(0, e.getDmgFixing());
		assertEquals(null, e.getType());
		assertFalse(e.isActive());
		assertEquals(0, e.getTimeUntilActive());
		assertEquals(0, e.getRadius());
	}
	
	@Test
	public void testExpand() {
		EventStub e = new EventStub();
		e.setActive(false);
		e.setRadius(5);
		e.expand(5);
		assertEquals(10, e.getRadius());
		assertTrue(e.isActive());
	}

}
