package behavioral.visitor.first.atvparts;

import behavioral.visitor.first.atvvisitor.AtvPartVisitor;

public interface AtvPart {
	public void accept(AtvPartVisitor visitor);
}
