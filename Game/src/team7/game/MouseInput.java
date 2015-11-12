package team7.game;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Qichao Hong
 * 
 * Mouse input
 *
 */
public class MouseInput implements MouseListener {
	
	private Handler handler;
	public MouseInput(Handler handler){
		this.handler=handler;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		Point key=e.getPoint();
		for(int i=0; i<handler.object.size();i++){
			GameObject tempObject=handler.object.get(i);
			
			if(tempObject.getId()==ID.Crab){
				//Mouse events for Crab
				if(key.getX()<(tempObject.getX()+40) && key.getX()>tempObject.getX()){
					if(key.getY()<(tempObject.getY()+40) && key.getY()>tempObject.getY()){
						for(int j=0; j<handler.object.size();j++){
							GameObject temp=handler.object.get(j);
							if(temp.getId()==ID.Trash){
								tempObject.setVelX((temp.getX()-tempObject.getX())/100);
								tempObject.setVelY((temp.getY()-tempObject.getY())/100);
							}
						}
					}
				}
				
			}
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
