/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author alexwill
 *This is the Antenna for communication with perseverance 
 */
public class Antenna implements SelfCheckCapable {
	String Plastic;
	String Metal;
	String Copper;
	/**
	 * Receive communication from perseverance, this verifies communication  to and from perseverance
	 */
	Void send() {
		Void signalrecieved = null;
		return signalrecieved;
		
	}
	/**
	 * This process receives signal sent from perseverance 
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
