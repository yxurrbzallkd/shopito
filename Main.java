import item.FlowerBucket;
import item.CactusFlower;
import item.RomashkaFlower;
import item_decorator.BasketDecorator;
import delivery.PostDeliveryStrategy;
import payment.PayPalPaymentStrategy;
import item.Item;
import order.Order;

public class Main {
    Order firstOrder = new Order();
    Item bucket = new FlowerBucket();
    CactusFlower cactus = new CactusFlower();
    RomashkaFlower romashka = new RomashkaFlower();
    bucket.addFlower(cactus);
    bucket.addFlower(romashka);
    BasketDecorator basket = new BasketDecorator(bucket);
    firstOrder.addItem(bucket);
    firstOrder.addItem(cactus);
    firstOrder.addItem(romashka);
    System.out.println("ccts+rmshk+basket (rmshk, ccts): price is "+firstOrder.getTotalPrice());
    firstOrder.removeItem(romashka);
    System.out.println("ccts+basket (rmshk, ccts): price is "+firstOrder.getTotalPrice());
    PayPalPaymentStrategy strtg = new PayPalPaymentStrategy();
    firstOrder.setPaymentStrategy(strtg);
    PostDeliveryStrategy pstrtg = new PostDeliveryStrategy();
    firstOrder.setDeliveryStrategy(pstrtg);
    firstOrder.processOrder();
}
