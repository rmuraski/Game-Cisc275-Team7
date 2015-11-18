package team7.game;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * @author Qichao Hong
 * 
 * Basic game window setting
 *
 */
public class GameUI extends Canvas{

	private static final long serialVersionUID = -2953728659860561832L;
	
	/**
	 * Set Game UI
	 * 
	 * @param width		Width of the window
	 * @param height	Height of the window
	 * @param title		Name of the game
	 * @param game		Load the game which want to start
	 */
	public GameUI(int width, int height, String title, Game game){
		JFrame frame=new JFrame(title);
		
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}
	
}
