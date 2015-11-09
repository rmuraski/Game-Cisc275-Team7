package team7.game;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {
	
	private Handler handler;
	public MouseInput(Handler handler){
		this.handler=handler;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Point key=e.getPoint();
		for(int i=0; i<handler.object.size();i++){
			GameObject tempObject=handler.object.get(i);
			
			if(tempObject.getId()==ID.Crab){
				//Mouse events for Crab
				
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
