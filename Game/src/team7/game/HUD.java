package team7.game;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	
	public static int HEALTH=10000;
	
	private int greenValue=255;
	
	private int score=0;
	private int level=1;
	
	
	public void tick(){
		HEALTH= Game.clamp(HEALTH, 0, 10000);
		greenValue=Game.clamp(greenValue, 0, 255);
		
		greenValue=HEALTH/100*2;
		score++;
	}
	
	public void render(Graphics g){
		g.setColor(Color.gray);
		g.fillRect(15, 15, 200, 32);
		g.setColor(new Color(75,greenValue,0));
		g.fillRect(17, 15, HEALTH/100*2, 30);
		g.setColor(Color.white);
		g.drawRect(16, 16, 200, 30);
		
		g.drawString("Score: "+score,10,64);
		g.drawString("Level: "+level,10,80);

	}
}