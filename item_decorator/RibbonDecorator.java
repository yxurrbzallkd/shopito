package item_decorator;
import item.Item;

public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item item){
        super(item);
    }

    @Override
    public double getPrice(){
        return super.getPrice()+40;
    }
}
