package team7.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * @author Qichao Hong
 *
 */
public class Trash extends GameObject{
	private Handler handler;
	/**
	 * @param x
	 * @param y
	 * @param id
	 * @param handler
	 */
	public Trash(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler=handler;
		velX=0;
		velY=0;
	}

	/* (non-Javadoc)
	 * @see team7.game.GameObject#tick()
	 */
	
	public void tick() {
		HUD.HEALTH-=10;
	}

	/* (non-Javadoc)
	 * @see team7.game.GameObject#render(java.awt.Graphics)
	 */
	
	public void render(Graphics g) {
		
		g.setColor(Color.white);
		g.fillRect(x, y, 40, 40);
		
		
		
	}

	/* (non-Javadoc)
	 * @see team7.game.GameObject#getBounds()
	 */
	
	public Rectangle getBounds() {
		return new Rectangle(x,y,40,40);
	}
	

}
