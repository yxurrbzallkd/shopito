package payment;

public class PayPalPaymentStrategy {
    public boolean pay(double price){
            System.out.println("Payed $"+price+" with PayPal");
            return true;
    }
}
