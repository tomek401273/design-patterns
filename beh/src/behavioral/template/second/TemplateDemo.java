package behavioral.template.second;

import behavioral.template.second.template.OrderTemplate;
import behavioral.template.second.template.store.StoreOrder;
import behavioral.template.second.template.web.WebOrder;

public class TemplateDemo {

	public static void main(String[] args) {
		System.out.println("Web Order:");
		
		OrderTemplate webOrder = new WebOrder();
		webOrder.processOrder();
		
		System.out.println("\nStore Order:");
		
		OrderTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder();
	}
}
