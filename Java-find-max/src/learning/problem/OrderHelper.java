package learning.problem;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderHelper {
	
	
	public static void displayHighestOrder(Order order)
	{
		List<Prescription> presList = order.getPresList();


		double temp=-1.0;
		int index = 0;
		for(int i=0;i<presList.size();i++) {
			if(presList.get(i).getAmount()>temp){
				temp = presList.get(i).getAmount();
				index = i; 
			}
			
		}
		
		
		
		System.out.println("itertative legacy way "+presList.get(index).getAmount()+","+presList.get(index).getRxNumber()+","+presList.get(index).getUnits());
		
		
		
		
		temp= -1.0;
		
		Prescription prestemp = null;
		
		for(Prescription pre : presList){
			if(pre.getAmount()>temp){
				temp = pre.getAmount();
				prestemp = pre;
			}

		}
		
		
		System.out.println("printing prescription"+prestemp);
		
		
		System.out.println("java 5 for loop way "+prestemp.getAmount() +","+ prestemp.getRxNumber() +","+ prestemp.getUnits());
		
		

		//presList.max()

		Prescription pres = Collections.max(presList);
		System.out.println("using collections  max The maximum is "+pres);
		
		
		
		presList.stream().forEach(pre->System.out.println(pre));
		
		Prescription presmax= presList.stream().max(Comparator.comparing(Prescription::getAmount)).get();
		
		System.out.println("using streams max "+presmax);
		
		
		
	    
	}

}
