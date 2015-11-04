package team7.game;

import java.awt.Point;

public abstract class Event {
	int timeUntilActive;
	boolean active;
	int dmgPerSecond;
	int dmgFixing;
	int timeUntilFixed;
	Point coordinates;
	int radius; // Area of Event will be starting at the coordinates as the center and epands
	// out by the radius amount
	Events type;
	
	
	
	public Event() {
	}
	public int getTimeUntilActive() {
		return timeUntilActive;
	}
	public void setTimeUntilActive(int timeUntilActive) {
		this.timeUntilActive = timeUntilActive;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getDmgPerSecond() {
		return dmgPerSecond;
	}
	public void setDmgPerSecond(int dmgPerSecond) {
		this.dmgPerSecond = dmgPerSecond;
	}
	public int getDmgFixing() {
		return dmgFixing;
	}
	public void setDmgFixing(int dmgFixing) {
		this.dmgFixing = dmgFixing;
	}
	public int getTimeUntilFixed() {
		return timeUntilFixed;
	}
	public void setTimeUntilFixed(int timeUntilFixed) {
		this.timeUntilFixed = timeUntilFixed;
	}
	public Point getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Point coordinates) {
		this.coordinates = coordinates;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Events getType() {
		return type;
	}
	public void setType(Events type) {
		this.type = type;
	}
	
	
	public boolean hasSolution(Solution s) {
		return s.Coordinates == this.coordinates;
	}
	
	public void resolveEvent() {
		setTimeUntilActive(0);
		setActive(false);
		setDmgPerSecond(0);
		setDmgFixing(0);
		setRadius(0);
		setTimeUntilActive(0);
		setType(null);
	}
	
	
	
	

}
