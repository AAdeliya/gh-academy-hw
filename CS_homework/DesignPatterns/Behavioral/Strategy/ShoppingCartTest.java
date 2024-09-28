package CS_homework.DesignPatterns.Behavioral.Strategy;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1  = new Item("1234", 10);
        Item item2  = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PayPalStrategy("paypal@test.com", "Sunshine123!"));
        cart.pay(new CreditCardStrategy("AJ", "1234", "111", "09.26"));

    }
    
}
