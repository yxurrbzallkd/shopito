package delivery;
import item.Item;
import java.util.List;

public abstract class DHLDeliveryStrategy implements Delivery{
        public boolean deliver(List<Item> items){
            System.out.println("Delivering order by DHM");
            return true;
        }
}
