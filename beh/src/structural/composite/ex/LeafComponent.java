package structural.composite.ex;

import java.util.ArrayList;
import java.util.List;

public abstract class LeafComponent {
    String name;
    String position;
    List<LeafComponent> leafComponentList = new ArrayList<>();

    public LeafComponent addLeafletComponent(LeafComponent leafComponent) {
        throw new UnsupportedOperationException();
    }

    public LeafComponent removeLeafComponent(LeafComponent leafComponent) {
        throw new UnsupportedOperationException();
    }

    public abstract String toString();

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String showPlant(LeafComponent leafComponent) {
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.append(":");
        stringBuilder.append(position);
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

}
