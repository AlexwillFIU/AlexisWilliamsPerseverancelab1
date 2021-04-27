/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author alexwill
 *This is the computer for processing command received by perseverance 
 */
public class Computer implements SelfCheckCapable {
	String Chips;
	String Processor;
	String Wires;
	/**
	 * This is responsible for reception of data 
	 * @return 
	 */
	Object receivedata() {
	return null;
	}
	/**
	 * 	This is to transmit date from robot
	 */
	void TransmitData() {
		
	}
	/**
	 * This is the action of the robot processing data received and transmitting data back to earth
	 */
	void ProcessData() {
		
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
