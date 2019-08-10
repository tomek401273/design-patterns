package behavioral.visitor.first.atvvisitor;

import behavioral.visitor.first.atvparts.items.PartsOrder;
import behavioral.visitor.first.atvparts.items.Fender;
import behavioral.visitor.first.atvparts.items.Oil;
import behavioral.visitor.first.atvparts.items.Wheel;

public interface AtvPartVisitor {
	void visit(Wheel wheel);
	void visit(Fender fender);
	void visit(Oil oil);
	void visit(PartsOrder partsOrder);
}
