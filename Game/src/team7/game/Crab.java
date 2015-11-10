package team7.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class Crab extends GameObject {
	Random r=new Random();
	Handler handler;
	
	public Crab(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler=handler;
	}

	@Override
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
	
	private void collision(){
		for (int i = 0; i < handler.object.size(); i++){
			GameObject tempObject=handler.object.get(i);
			if(tempObject.getId()==ID.Trash){
				
				if(getBounds().intersects(tempObject.getBounds())){
					HUD.HEALTH+=20;
					
				}
			}
		}
	}
	

	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 40, 40);
		
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle(x,y,40,40);
	}

}
