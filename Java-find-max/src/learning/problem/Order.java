package learning.problem;

import java.util.List;

public class Order {
	
	private String orderId;
	private List<Prescription> presList;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public List<Prescription> getPresList() {
		return presList;
	}
	public void setPresList(List<Prescription> presList) {
		this.presList = presList;
	}
	
	

}
