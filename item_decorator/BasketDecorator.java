package item_decorator;
import item.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item){
        super(item);
    }

    @Override
    public double getPrice(){
        return super.getPrice()+40;
    }
}
