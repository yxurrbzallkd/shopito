package item_decorator;
import item.Item;

public abstract class ItemDecorator implements Item{
    private Item item;

    public ItemDecorator(Item item){
        this.item = item;
    }

    public double getPrice(){
        return item.getPrice();
    }

    public String getDescription(){
        return item.getDescription();
    }
}