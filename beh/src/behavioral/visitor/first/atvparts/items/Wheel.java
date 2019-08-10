package behavioral.visitor.first.atvparts.items;

import behavioral.visitor.first.atvvisitor.AtvPartVisitor;
import behavioral.visitor.first.atvparts.AtvPart;

public class Wheel implements AtvPart {
	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
