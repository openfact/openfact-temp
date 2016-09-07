package org.openfact.models.jpa.entities.ubl;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to define a reference to an order line.
 * 
 * @author Erik
 * @version 1.0
 * @created 07-Set.-2016 9:16:17 a. m.
 */
public class OrderLineReference {

	/**
	 * An identifier for the referenced order line, assigned by the buyer.
	 */
	private String lineID;
	/**
	 * A code signifying the status of the referenced order line with respect to
	 * its original state.
	 */
	private String lineStatusCode;
	/**
	 * An identifier for the referenced order line, assigned by the seller.
	 */
	private String salesOrderLineID;
	/**
	 * A universally unique identifier for this order line reference.
	 */
	private String UUID;
	private List<OrderReference> orderReferences = new ArrayList<>();

	public OrderLineReference() {

	}

	public void finalize() throws Throwable {

	}

	public String getLineID() {
		return lineID;
	}

	public void setLineID(String lineID) {
		this.lineID = lineID;
	}

	public String getLineStatusCode() {
		return lineStatusCode;
	}

	public void setLineStatusCode(String lineStatusCode) {
		this.lineStatusCode = lineStatusCode;
	}

	public String getSalesOrderLineID() {
		return salesOrderLineID;
	}

	public void setSalesOrderLineID(String salesOrderLineID) {
		this.salesOrderLineID = salesOrderLineID;
	}

	public String getUUID() {
		return UUID;
	}

	public void setUUID(String UUID) {
		this.UUID = UUID;
	}

	public List<OrderReference> getOrderReferences() {
		return orderReferences;
	}

	public void setOrderReferences(List<OrderReference> orderReferences) {
		this.orderReferences = orderReferences;
	}
}// end Order LineReference