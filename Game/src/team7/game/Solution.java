package team7.game;

import java.awt.Point;

/**
 * Solution Class
 */
public abstract class Solution {
	int movingSpeed;
	boolean Fixing=false;
	int fixingSpeed;
	Point Coordinates;
	Events type;
	
	public int getMovingSpeed(){
		return this.movingSpeed;
	}
	public boolean isFixing(){
		return this.Fixing;
	}
	public abstract void fix();
	public int getFixingSpeed(){
		return this.fixingSpeed;
	}
	public Point getCoordinates(){
		return this.Coordinates;
	}
	public int calculateFixTime(){
		
		//TODO claculate the fix time return it
		return 0;
	}
	
}
