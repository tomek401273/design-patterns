package behavioral.visitor.first;

import behavioral.visitor.first.atvparts.items.PartsOrder;
import behavioral.visitor.first.atvparts.items.Fender;
import behavioral.visitor.first.atvparts.items.Oil;
import behavioral.visitor.first.atvparts.items.Wheel;
import behavioral.visitor.first.atvvisitor.impl.AtvPartsDisplayVisitor;
import behavioral.visitor.first.atvvisitor.impl.AtvPartsShippingVisitor;

public class VisitorDemo {

	public static void main(String[] args) {
		PartsOrder order = new PartsOrder();
		order.addPart(new Wheel());
		order.addPart(new Fender());
		order.addPart(new Oil());
		
		order.accept(new AtvPartsShippingVisitor());
		order.accept(new AtvPartsDisplayVisitor());
	}
}
