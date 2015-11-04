package team7.game;

import java.awt.Point;

/**
 * Solution Class
 */
public abstract class Solution {
	int movingSpeed;
	boolean fixing;
	int fixingSpeed;
	Point Coordinates;
	Events type;
	
	public int getMovingSpeed(){
		return this.movingSpeed;
	}
	public boolean isFixing(){
		return this.fixing;
	}
	public abstract void fix();
	public int getFixingSpeed(){
		return this.fixingSpeed;
	}
	public Point getCoordinates(){
		return this.Coordinates;
	}
	public int getFixTime(){
		
		//TODO claculate the fix time return it
		return 0;
	}
	public void setMovingSpeed(int movingSpeed){
		this.movingSpeed=movingSpeed;
	}
	public void setfixingSpeed(int fixingSpeed){
		this.fixingSpeed=fixingSpeed;
	}
	public void setFixing(boolean fixing){
		this.fixing=fixing;
	}
	
	
}
