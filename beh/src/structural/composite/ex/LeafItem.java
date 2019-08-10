package structural.composite.ex;

public class LeafItem extends LeafComponent{

    public LeafItem(String name, String positon) {
        this.name = name;
        this.position = positon;
    }

    @Override
    public String toString() {
        return showPlant(this);
    }
}
