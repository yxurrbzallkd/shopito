package delivery;
import java.util.List;
import item.Item;

public abstract class PostDeliveryStrategy implements Delivery{
    public boolean deliver(List<Item> items){
        System.out.println("Delivering order by post");
        return true;
    }
}
