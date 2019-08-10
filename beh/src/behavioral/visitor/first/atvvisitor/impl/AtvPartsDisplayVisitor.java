package behavioral.visitor.first.atvvisitor.impl;

import behavioral.visitor.first.atvparts.items.PartsOrder;
import behavioral.visitor.first.atvparts.items.Fender;
import behavioral.visitor.first.atvparts.items.Oil;
import behavioral.visitor.first.atvparts.items.Wheel;
import behavioral.visitor.first.atvvisitor.AtvPartVisitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {

	@Override
	public void visit(Wheel wheel) {
		System.out.println("We have a wheel.");
	}

	@Override
	public void visit(Fender fender) {
		System.out.println("We have a fender.");

	}

	@Override
	public void visit(Oil oil) {
		System.out.println("We have oil.");

	}

	@Override
	public void visit(PartsOrder partsOrder) {
		System.out.println("We have an order.");

	}

}
