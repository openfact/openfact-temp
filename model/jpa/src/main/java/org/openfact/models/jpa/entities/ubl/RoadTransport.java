package org.openfact.models.jpa.entities.ubl;

import org.openfact.models.jpa.entities.ubl2.Road;

/**
 * A class for identifying a vehicle used for road transport.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:17:36 a. m.
 */
public class RoadTransport {

	/**
	 * The license plate identifier of this vehicle.
	 */
	private String LicensePlateID;

	public Road Transport(){

	}

	public void finalize() throws Throwable {

	}
	public String getLicensePlateID(){
		return LicensePlateID;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setLicensePlateID(String newVal){
		LicensePlateID = newVal;
	}
}//end Road Transport