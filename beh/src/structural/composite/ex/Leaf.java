package structural.composite.ex;

import java.util.Iterator;

public class Leaf extends LeafComponent {
    public Leaf(String name, String positon) {
        this.name = name;
        this.position = positon;
    }

    @Override
    public LeafComponent addLeafletComponent(LeafComponent leafComponent) {
        leafComponentList.add(leafComponent);
        return leafComponent;
    }

    @Override
    public LeafComponent removeLeafComponent(LeafComponent leafComponent) {
        leafComponentList.remove(leafComponent);
        return leafComponent;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(showPlant(this));
        Iterator<LeafComponent> leafComponentIterator = leafComponentList.iterator();

        while (leafComponentIterator.hasNext()) {
            LeafComponent leafComponent = leafComponentIterator.next();
            builder.append(leafComponent);
        }
        return builder.toString();
    }
}
