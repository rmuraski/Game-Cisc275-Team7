package team7.game;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * @author Qichao
 * 
 * This abstract Basic Game unit
 *
 */
public abstract class GameObject {
	protected int x, y;
	protected ID id;
	protected int velX, velY;
	
	/**
	 * Constructor
	 * @param x		x coordinate
	 * @param y		y coordinate
	 * @param id	ID
	 */
	public GameObject(int x,int y, ID id){
		this.x=x;
		this.y=y;
		this.id=id;
	}
	/**
	 *  Control the object in every tick
	 */
	public abstract void tick();
	/**
	 * render the object
	 * @param g
	 */
	public abstract void render(Graphics g);
	/**
	 * the bounds of object
	 * @return the bounds
	 */
	public abstract Rectangle getBounds();
	/**
	 * getter 
	 * @return x
	 */
	public int getX() {
		return x;
	}
	/**
	 * 
	 * setter
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * get y
	 * @return y
	 */
	public int getY() {
		return y;
	}
	/**
	 * set y
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return
	 */
	public ID getId() {
		return id;
	}
	/**
	 * @param id
	 */
	public void setId(ID id) {
		this.id = id;
	}
	/**
	 * @return
	 */
	public int getVelX() {
		return velX;
	}
	/**
	 * @param velX
	 */
	public void setVelX(int velX) {
		this.velX = velX;
	}
	/**
	 * @return
	 */
	public int getVelY() {
		return velY;
	}
	/**
	 * @param velY
	 */
	public void setVelY(int velY) {
		this.velY = velY;
	}
	
}
