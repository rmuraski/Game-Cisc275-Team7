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
		y+=velY;
		x+=velX;
		
		
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 40, 40);
		
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

}
