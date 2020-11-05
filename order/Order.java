package order;
import item.Item;
import payment.Payment;
import delivery.Delivery;
import java.util.List;

public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }
    public double getTotalPrice(){
        double n = 0;
        for (int i = 0; i < this.items.size(); i++){
            n += this.items.get(i).getPrice();
        }
        return n;
    }
    public void processOrder(){
        double price = getTotalPrice();
        if (payment.pay(price)){
            delivery.deliver(items);
        }
    }
    public void addItem(Item something){
        this.items.add(something);
    }
    public void deleteItem(Item something){
        this.items.remove(something);
    }
}
