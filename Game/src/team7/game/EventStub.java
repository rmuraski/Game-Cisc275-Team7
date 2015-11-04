package team7.game;

import java.awt.Point;

public class EventStub extends Event {
	
	public EventStub() {
		this.timeUntilActive = 5;
		this.coordinates = new Point (1, 1);
		this.active = true;
		this.radius = 3;
		this.type = Events.ALGAEBLOOM;
		this.dmgFixing = 3;
		this.dmgPerSecond = 3;
	}

}
