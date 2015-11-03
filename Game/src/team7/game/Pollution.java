package team7.game;
/**Pollution class extends from the GameUI class.
 * It has a boolean method isFixing that returns a boolean value
 * depending on whether a pollution problem is being fixed or
 * not. There is also a void method that sets the variable
 * isFixing to either true or false.  */

public class Pollution extends GameUI {
	public boolean isFixing;

	public boolean isFixing() {
		return isFixing;
/**@return 				this returns a boolean value determined on whether the
 *  					pollution is being fixed or not.   */
	}

	public void setFixing(boolean isFixing) {
		this.isFixing = isFixing;
	}
/**@param 				isFixing is a boolean for whether the pollution is being fixed.  */
	
	
	

}
