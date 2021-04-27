/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author alexwill
 *This is the wiring in perseverance 
 */
public class Wire implements SelfCheckCapable {
	String Copper;
	String Fiber;
	/**
	 * This facilitates the transmission of data for instruction of the robot
	 */
	void TransmitData() {
	}
	/**
	 * Instructs perseverance to process signal received 
	 */
	void ReceiveSignal() {
		
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
