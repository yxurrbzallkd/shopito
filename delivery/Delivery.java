package delivery;
import item.Item;
import java.util.List;

public interface Delivery {
    public boolean deliver(List<Item> items);
}
