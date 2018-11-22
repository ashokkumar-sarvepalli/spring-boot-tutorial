package learning.problem;

import java.util.ArrayList;
import java.util.List;

public class OrderHelperTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		Prescription p1 = new Prescription("234",10,132.0);
		Prescription p2 = new Prescription("345",12,235.0);
		Prescription p3 = new Prescription("211",5,200.0);
		
		List<Prescription> presList = new ArrayList<Prescription>();
		
		presList.add(p1);
		presList.add(p2);
		presList.add(p3);
		
		order.setPresList(presList);
		order.setOrderId("43435");
		
		
		OrderHelper.displayHighestOrder(order);
	}

}
