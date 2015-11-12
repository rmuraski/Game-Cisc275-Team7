package team7.game;

import java.awt.Graphics;
import java.util.LinkedList;

/**
 * @author Qichao Hong
 *
 */
public class Handler {
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	/**
	 * 
	 */
	public void tick(){
		for(int i=0; i< object.size(); i++){
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	/**
	 * @param g
	 */
	public void render(Graphics g){
		for(int i=0; i<object.size();i++){
			GameObject tempObject=object.get(i);
			
			tempObject.render(g);
		}
	}
	
	/**
	 * @param object
	 */
	public void addObject(GameObject object){
		this.object.add(object);
	}
	
	/**
	 * @param object
	 */
	public void removeObject(GameObject object){
		this.object.remove(object);
	}
}
