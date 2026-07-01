package shoppingcart;

public class TestShopping {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        try {

            cart.addToCart(new Product("Marker", 25));
            cart.addToCart(new Product("Pen", 30));

            cart.checkout();

        } catch (ShoppingCartException e) {

            System.out.println(e.getMessage());
        }
    }
}