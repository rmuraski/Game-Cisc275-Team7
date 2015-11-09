package team7.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Trash extends GameObject{
	private Handler handler;
	public Trash(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler=handler;
		velX=0;
		velY=0;
	}

	@Override
	public void tick() {
				
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 40, 40);
		
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
