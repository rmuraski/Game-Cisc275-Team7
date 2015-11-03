package team7.game;

import java.awt.Point;

/**
 * Solution Class
 */
public abstract class Solution {
	int movingSpeed;
	boolean isFixing;
	int fixingSpeed;
	Point Coordinates;
	Events type;
	
	public abstract void fix();
	public int calculateFixTime(){
		
		//TODO claculate the fix time return it
		return 0;
	}
	
}
