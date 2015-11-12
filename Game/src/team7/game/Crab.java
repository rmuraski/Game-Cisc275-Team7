package team7.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


/**
 * @author Qichao Hong
 * 
 * This class create crab and drow on the screen
 * 
 *
 */
public class Crab extends GameObject {
	Random r=new Random();
	Handler handler;
	
	/**
	 * Constructor
	 * @param x			initial x coordinate
	 * @param y			initial y coordinate
	 * @param id		ID
	 * @param handler	Handler class controls the game
	 */
	public Crab(int x, int y, ID id, Handler handler) {
		
		super(x, y, id);
		this.handler=handler;
	}

	
	/* (non-Javadoc)
	 * @see team7.game.GameObject#tick()
	 */
	public void tick() {
		for(int i=0;i<handler.object.size();i++){
			GameObject tempObject=handler.object.get(i);
			
			if(tempObject.getId()==ID.Trash){
				y+=velY;
				x+=velX;
				x=Game.clamp(x, 0, tempObject.getX());
				y=Game.clamp(y, 0, tempObject.getY());
				collision();
			}
		}
		
	}
	
	/**
	 * judge the crab if it collision with crab
	 */
	private void collision(){
		for (int i = 0; i < handler.object.size(); i++){
			GameObject tempObject=handler.object.get(i);
			if(tempObject.getId()==ID.Trash){
				
				if(getBounds().intersects(tempObject.getBounds())){
					HUD.HEALTH+=20;
					
					HUD.score+=1;
					
				}
			}
		}
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
