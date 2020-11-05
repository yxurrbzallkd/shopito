package item;

public abstract class Flower implements Item {
    public String getDescription() {
        return "A Flower";
    }

    public double getPrice() {
        return 0;
    }
}
