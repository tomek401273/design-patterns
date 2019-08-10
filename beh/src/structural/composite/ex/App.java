package structural.composite.ex;

public class App {
    public static void main(String[] args) {
        Leaf leaf = new Leaf("linden", "garden");

        LeafItem leafItem = new LeafItem("firstItem", "linden");
        leaf.addLeafletComponent(leafItem);

        Leaf firstBranch = new Leaf("firstBranch", "linden");
        leaf.addLeafletComponent(firstBranch);

        LeafItem secondLeaf = new LeafItem("firstBranch", "secoundLeafInBranch");
        firstBranch.addLeafletComponent(secondLeaf);

        System.out.println(leaf.toString());
    }
}
